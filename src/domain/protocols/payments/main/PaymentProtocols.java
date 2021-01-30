package domain.protocols.payments.main;


import java.util.ArrayList;

public interface PaymentProtocols {

    ArrayList<Payment> getPaymentList();

    void setPaymentList(Payment payment);
}
