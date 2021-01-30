package data.useCases.payment.main;

import java.util.Date;

public class Payment implements domain.protocols.payments.main.Payment {
    private String nameEstablishment;
    private double amount;
    private int codeTransaction;
    private Date dateTime;

    public String getNameEstablishment() {
        return nameEstablishment;
    }

    public void setNameEstablishment(String nameEstablishment) {
        this.nameEstablishment = nameEstablishment;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCodeTransaction() {
        return codeTransaction;
    }

    public void setCodeTransaction(int codeTransaction) {
        this.codeTransaction = codeTransaction;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }


}
