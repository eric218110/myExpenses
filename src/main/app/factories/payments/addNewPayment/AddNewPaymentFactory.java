package main.app.factories.payments.addNewPayment;

import domain.protocols.payments.add.AddPaymentProtocol;
import domain.protocols.payments.main.PaymentProtocols;
import main.app.factories.payments.paymentList.PaymentListFactory;
import presentation.services.payment.add.ServiceAddPayment;

public class AddNewPaymentFactory {
    public static AddPaymentProtocol maker(){
        return new ServiceAddPayment(PaymentListFactory.maker());
    }
}
