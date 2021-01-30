package data.useCases.payment.list;

import domain.protocols.payments.main.Payment;
import domain.protocols.payments.main.PaymentProtocols;

import java.util.ArrayList;

public class PaymentList implements PaymentProtocols {
    private ArrayList<Payment> paymentArrayList;

    {
        this.paymentArrayList = new ArrayList<>();
    }

    public ArrayList<Payment> getPaymentList() {
        return paymentArrayList;
    }

    public void setPaymentList(Payment payment) {
        this.paymentArrayList.add(payment);
    }
}
