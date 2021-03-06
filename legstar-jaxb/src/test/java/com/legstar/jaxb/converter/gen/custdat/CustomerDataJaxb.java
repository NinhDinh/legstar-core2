package com.legstar.jaxb.converter.gen.custdat;

import com.legstar.base.type.composite.CobolComplexType;
import com.legstar.base.visitor.InvalidChoiceAlternativeException;
import com.legstar.base.visitor.NoAlternativeForChoiceException;
import com.legstar.base.visitor.InvalidComplexTypeFieldIndexException;
import com.legstar.base.visitor.InvalidComplexTypeNameException;
import com.legstar.jaxb.converter.JaxbWrapper;
import com.legstar.jaxb.converter.JaxbWrapperFactory;

public class CustomerDataJaxb implements JaxbWrapperFactory {

    public JaxbWrapper<?> create(CobolComplexType type) {
        if ("PersonalData".equals(type.getName())) {
            return new PersonalDataJaxbWrapper();
        }
        if ("Filler12".equals(type.getName())) {
            return new Filler12JaxbWrapper();
        }
        if ("Transaction".equals(type.getName())) {
            return new TransactionJaxbWrapper();
        }
        if ("Transactions".equals(type.getName())) {
            return new TransactionsJaxbWrapper();
        }
        if ("CustomerData".equals(type.getName())) {
            return new CustomerDataJaxbWrapper();
        }
        throw new InvalidComplexTypeNameException(type.getName());
    }

    public JaxbWrapper < ? > create(CobolComplexType type, Object jaxb) {
        if ("PersonalData".equals(type.getName())) {
            return new PersonalDataJaxbWrapper((legstar.test.jaxb.cusdat.PersonalData) jaxb);
        }
        if ("Filler12".equals(type.getName())) {
            return new Filler12JaxbWrapper((legstar.test.jaxb.cusdat.Filler12) jaxb);
        }
        if ("Transaction".equals(type.getName())) {
            return new TransactionJaxbWrapper((legstar.test.jaxb.cusdat.Transaction) jaxb);
        }
        if ("Transactions".equals(type.getName())) {
            return new TransactionsJaxbWrapper((legstar.test.jaxb.cusdat.Transactions) jaxb);
        }
        if ("CustomerData".equals(type.getName())) {
            return new CustomerDataJaxbWrapper((legstar.test.jaxb.cusdat.CustomerData) jaxb);
        }
        throw new InvalidComplexTypeNameException(type.getName());
    }

    public class PersonalDataJaxbWrapper extends JaxbWrapper<legstar.test.jaxb.cusdat.PersonalData> {

        public PersonalDataJaxbWrapper() {
            this(new legstar.test.jaxb.cusdat.PersonalData());
        }

        public PersonalDataJaxbWrapper(legstar.test.jaxb.cusdat.PersonalData jaxb) {
            super(jaxb);
        }

        public void set(int index, Object value, int alternativeIndex) {
            switch (index) {
            case 0:
                getJaxb().setCustomerName((String) value);
                break;
            case 1:
                getJaxb().setCustomerAddress((String) value);
                break;
            case 2:
                getJaxb().setCustomerPhone((String) value);
                break;
            default:
                throw new InvalidComplexTypeFieldIndexException("PersonalData", index);
            }
        }

        public Object get(int index) {
            switch (index) {
            case 0:
                return getJaxb().getCustomerName();
            case 1:
                return getJaxb().getCustomerAddress();
            case 2:
                return getJaxb().getCustomerPhone();
            default:
                throw new InvalidComplexTypeFieldIndexException("PersonalData", index);
            }
        }

        @Override
        public String toString() {
            if (getJaxb() == null) {
                return "{}";
            }
            StringBuilder builder = new StringBuilder();
            builder.append("{");
            builder.append("customerName=");
            builder.append(getJaxb().getCustomerName());
            builder.append(", ");
            builder.append("customerAddress=");
            builder.append(getJaxb().getCustomerAddress());
            builder.append(", ");
            builder.append("customerPhone=");
            builder.append(getJaxb().getCustomerPhone());
            builder.append("}");
            return builder.toString();
        }

    }
    public class Filler12JaxbWrapper extends JaxbWrapper<legstar.test.jaxb.cusdat.Filler12> {

        public Filler12JaxbWrapper() {
            this(new legstar.test.jaxb.cusdat.Filler12());
        }

        public Filler12JaxbWrapper(legstar.test.jaxb.cusdat.Filler12 jaxb) {
            super(jaxb);
        }

        public void set(int index, Object value, int alternativeIndex) {
            switch (index) {
            case 0:
                getJaxb().setTransactionDay((String) value);
                break;
            case 1:
                getJaxb().setFiller14((String) value);
                break;
            case 2:
                getJaxb().setTransactionMonth((String) value);
                break;
            case 3:
                getJaxb().setFiller16((String) value);
                break;
            case 4:
                getJaxb().setTransactionYear((String) value);
                break;
            default:
                throw new InvalidComplexTypeFieldIndexException("Filler12", index);
            }
        }

        public Object get(int index) {
            switch (index) {
            case 0:
                return getJaxb().getTransactionDay();
            case 1:
                return getJaxb().getFiller14();
            case 2:
                return getJaxb().getTransactionMonth();
            case 3:
                return getJaxb().getFiller16();
            case 4:
                return getJaxb().getTransactionYear();
            default:
                throw new InvalidComplexTypeFieldIndexException("Filler12", index);
            }
        }

        @Override
        public String toString() {
            if (getJaxb() == null) {
                return "{}";
            }
            StringBuilder builder = new StringBuilder();
            builder.append("{");
            builder.append("transactionDay=");
            builder.append(getJaxb().getTransactionDay());
            builder.append(", ");
            builder.append("filler14=");
            builder.append(getJaxb().getFiller14());
            builder.append(", ");
            builder.append("transactionMonth=");
            builder.append(getJaxb().getTransactionMonth());
            builder.append(", ");
            builder.append("filler16=");
            builder.append(getJaxb().getFiller16());
            builder.append(", ");
            builder.append("transactionYear=");
            builder.append(getJaxb().getTransactionYear());
            builder.append("}");
            return builder.toString();
        }

    }
    public class TransactionJaxbWrapper extends JaxbWrapper<legstar.test.jaxb.cusdat.Transaction> {

        public TransactionJaxbWrapper() {
            this(new legstar.test.jaxb.cusdat.Transaction());
        }

        public TransactionJaxbWrapper(legstar.test.jaxb.cusdat.Transaction jaxb) {
            super(jaxb);
        }

        public void set(int index, Object value, int alternativeIndex) {
            switch (index) {
            case 0:
                switch (alternativeIndex) {
                case 0:
                    getJaxb().setTransactionDate((String) value);
                    break;
                case 1:
                    getJaxb().setFiller12(((Filler12JaxbWrapper) value).getJaxb());
                    break;
                default:
                    throw new InvalidChoiceAlternativeException("TransactionDateChoice",
                            alternativeIndex);
                }
                break;
            case 1:
                getJaxb().setTransactionAmount((java.math.BigDecimal) value);
                break;
            case 2:
                getJaxb().setTransactionComment((String) value);
                break;
            default:
                throw new InvalidComplexTypeFieldIndexException("Transaction", index);
            }
        }

        public Object get(int index) {
            switch (index) {
            case 0:
                if (getJaxb().getTransactionDate() != null) {
                    return getJaxb().getTransactionDate();
                } else if (getJaxb().getFiller12() != null) {
                    return new Filler12JaxbWrapper(getJaxb().getFiller12());
                } else {
                    throw new NoAlternativeForChoiceException("TransactionDateChoice");
                }
            case 1:
                return getJaxb().getTransactionAmount();
            case 2:
                return getJaxb().getTransactionComment();
            default:
                throw new InvalidComplexTypeFieldIndexException("Transaction", index);
            }
        }

        @Override
        public String toString() {
            if (getJaxb() == null) {
                return "{}";
            }
            StringBuilder builder = new StringBuilder();
            builder.append("{");
            builder.append("transactionDateChoice=");
            if (getJaxb().getTransactionDate() != null) {
                builder.append("transactionDate=");
                builder.append(getJaxb().getTransactionDate());
            }
            if (getJaxb().getFiller12() != null) {
                builder.append("filler12=");
                builder.append(new Filler12JaxbWrapper(getJaxb().getFiller12()));
            }
            builder.append(", ");
            builder.append("transactionAmount=");
            builder.append(getJaxb().getTransactionAmount());
            builder.append(", ");
            builder.append("transactionComment=");
            builder.append(getJaxb().getTransactionComment());
            builder.append("}");
            return builder.toString();
        }

    }
    public class TransactionsJaxbWrapper extends JaxbWrapper<legstar.test.jaxb.cusdat.Transactions> {

        public TransactionsJaxbWrapper() {
            this(new legstar.test.jaxb.cusdat.Transactions());
        }

        public TransactionsJaxbWrapper(legstar.test.jaxb.cusdat.Transactions jaxb) {
            super(jaxb);
        }

        public void set(int index, Object value, int alternativeIndex) {
            switch (index) {
            case 0:
                getJaxb().setTransactionNbr((Long) value);
                break;
            case 1:
                getJaxb().getTransaction().clear();
                if (value instanceof java.util.List) {
                    for (Object wrapperItem : (java.util.List<?>) value) {
                        if (wrapperItem instanceof TransactionJaxbWrapper){
                            getJaxb().getTransaction().add(((TransactionJaxbWrapper) wrapperItem).getJaxb());
                        }
                    }
                }
                break;
            default:
                throw new InvalidComplexTypeFieldIndexException("Transactions", index);
            }
        }

        public Object get(int index) {
            switch (index) {
            case 0:
                return getJaxb().getTransactionNbr();
            case 1:
                java.util.List < TransactionJaxbWrapper > transaction = new java.util.ArrayList < TransactionJaxbWrapper >();
                for (legstar.test.jaxb.cusdat.Transaction jaxbItem : getJaxb().getTransaction()) {
                    transaction.add(new TransactionJaxbWrapper(jaxbItem));
                }
                return transaction;
            default:
                throw new InvalidComplexTypeFieldIndexException("Transactions", index);
            }
        }

        @Override
        public String toString() {
            if (getJaxb() == null) {
                return "{}";
            }
            StringBuilder builder = new StringBuilder();
            builder.append("{");
            builder.append("transactionNbr=");
            builder.append(getJaxb().getTransactionNbr());
            builder.append(", ");
            builder.append("transaction=");
            java.util.List < TransactionJaxbWrapper > transaction = new java.util.ArrayList < TransactionJaxbWrapper >();
            for (legstar.test.jaxb.cusdat.Transaction jaxbItem : getJaxb().getTransaction()) {
                transaction.add(new TransactionJaxbWrapper(jaxbItem));
            }
            builder.append(transaction);
            builder.append("}");
            return builder.toString();
        }

    }
    public class CustomerDataJaxbWrapper extends JaxbWrapper<legstar.test.jaxb.cusdat.CustomerData> {

        public CustomerDataJaxbWrapper() {
            this(new legstar.test.jaxb.cusdat.CustomerData());
        }

        public CustomerDataJaxbWrapper(legstar.test.jaxb.cusdat.CustomerData jaxb) {
            super(jaxb);
        }

        public void set(int index, Object value, int alternativeIndex) {
            switch (index) {
            case 0:
                getJaxb().setCustomerId((Long) value);
                break;
            case 1:
                getJaxb().setPersonalData(((PersonalDataJaxbWrapper) value).getJaxb());
                break;
            case 2:
                getJaxb().setTransactions(((TransactionsJaxbWrapper) value).getJaxb());
                break;
            default:
                throw new InvalidComplexTypeFieldIndexException("CustomerData", index);
            }
        }

        public Object get(int index) {
            switch (index) {
            case 0:
                return getJaxb().getCustomerId();
            case 1:
                return new PersonalDataJaxbWrapper(getJaxb().getPersonalData());
            case 2:
                return new TransactionsJaxbWrapper(getJaxb().getTransactions());
            default:
                throw new InvalidComplexTypeFieldIndexException("CustomerData", index);
            }
        }

        @Override
        public String toString() {
            if (getJaxb() == null) {
                return "{}";
            }
            StringBuilder builder = new StringBuilder();
            builder.append("{");
            builder.append("customerId=");
            builder.append(getJaxb().getCustomerId());
            builder.append(", ");
            builder.append("personalData=");
            builder.append(new PersonalDataJaxbWrapper(getJaxb().getPersonalData()));
            builder.append(", ");
            builder.append("transactions=");
            builder.append(new TransactionsJaxbWrapper(getJaxb().getTransactions()));
            builder.append("}");
            return builder.toString();
        }

    }

}
