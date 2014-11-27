package com.legstar.converter.finder;

import com.legstar.converter.type.composite.CobolComplexType;
import com.legstar.converter.visitor.MaxBytesLenCobolVisitor;
import com.legstar.converter.visitor.MinBytesLenCobolVisitor;
import com.legstar.converter.visitor.ValidateFromCobolVisitor;

/**
 * This finder implementation assumes a complex type starts with a number of
 * fields that have recognizable formats and boundaries. All together these
 * fields form the Type's signature.
 * <p/>
 * This finder is constructed using a Cobol complex type and a stop field which
 * delimits the number of fields at the start of the complex type forming the
 * type's 'signature'.
 * <p/>
 * Note that some Cobol types are easier to recognize than others, for instance
 * {@link CobolPackedDecimalType} and {@link CobolZonedDecimalType} impose
 * severe limitation on their content and therefore are unlikely to be missed
 * for some other type. So you want to have as many as possible of these in your
 * signature.
 * <p/>
 * Decimal types can be defined with boundaries (minInclusive and maxInclusive)
 * which are very useful to avoid the risk of a mismatch.
 * <p/>
 * Note that this implementation will not work if the signature part of the type
 * contains variable size arrays (DEPENDING ON) or choices (REDEFINES).
 *
 */
public class CobolComplexTypeFinder extends CobolTypeFinder {

    /** Structure that starts with the signature. */
    private final CobolComplexType cobolComplexType;

    /** Where does the signature stop. */
    private final String stopFieldInclusive;

    /** How many bytes are needed to uniquely identify a type. */
    private final int signatureLen;

    /** The complex type maximum size in host bytes */
    private final int maxBytesLen;

    /** The complex type minimum size in host bytes */
    private final int minBytesLen;

    /**
     * Construct the finder.
     * 
     * @param cobolComplexType the Cobol complex type we are looking for
     * @param stopFieldInclusive what is the last field of the signature (the
     *            signature is formed by all fields from the start of the
     *            complex type up to this one). If you pass null or a field that
     *            is not in the complex type, the entire complex type form the
     *            signature.
     */
    public CobolComplexTypeFinder(CobolComplexType cobolComplexType,
            String stopFieldInclusive) {

        this.cobolComplexType = cobolComplexType;
        this.stopFieldInclusive = stopFieldInclusive;

        MinBytesLenCobolVisitor minLenVisitor = new MinBytesLenCobolVisitor();
        minLenVisitor.visit(cobolComplexType);
        minBytesLen = minLenVisitor.getMinBytesLen();

        MaxBytesLenCobolVisitor maxLenVisitor = new MaxBytesLenCobolVisitor();
        maxLenVisitor.visit(cobolComplexType);
        maxBytesLen = maxLenVisitor.getMaxBytesLen();

        MaxBytesLenCobolVisitor signatureLenvisitor = new MaxBytesLenCobolVisitor(
                stopFieldInclusive);
        signatureLenvisitor.visit(cobolComplexType);
        signatureLen = signatureLenvisitor.getMaxBytesLen();

    }

    /** {@inheritDoc} */
    public boolean match(byte[] hostData, int start, int length) {
        
        ValidateFromCobolVisitor visitor = new ValidateFromCobolVisitor(
                hostData, start, stopFieldInclusive);
        visitor.visit(cobolComplexType);
        return visitor.isValid();

    }

    /** {@inheritDoc} */
    public int signatureLen() {
        return signatureLen;
    }

    public CobolComplexType getCobolComplexType() {
        return cobolComplexType;
    }

    public String getStopFieldInclusive() {
        return stopFieldInclusive;
    }

    public int getSignatureLen() {
        return signatureLen;
    }

    public int getMinBytesLen() {
        return minBytesLen;
    }

    public int getMaxBytesLen() {
        return maxBytesLen;
    }

}