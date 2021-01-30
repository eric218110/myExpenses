package domain.protocols.payments.main;

import java.util.Date;

public interface Payment {
    String getNameEstablishment();

    void setNameEstablishment(String nameEstablishment);

    double getAmount();

    void setAmount(double amount);

    int getCodeTransaction();

    void setCodeTransaction(int codeTransaction);

    Date getDateTime();

    void setDateTime(Date dateTime);
}
