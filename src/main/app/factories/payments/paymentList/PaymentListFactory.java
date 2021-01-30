package main.app.factories.payments.paymentList;

import data.useCases.payment.list.PaymentList;
import domain.protocols.payments.main.PaymentProtocols;

public class PaymentListFactory {
    public static PaymentProtocols maker(){
        return new PaymentList();
    }
}
