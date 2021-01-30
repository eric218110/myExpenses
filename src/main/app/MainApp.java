package main.app;

import domain.protocols.payments.add.AddPaymentProtocol;
import domain.protocols.payments.main.Payment;
import main.app.factories.payments.addNewPayment.AddNewPaymentFactory;

import java.util.Date;

public class MainApp {
    public static void main(String[] args) {
        Payment payment = new data.useCases.payment.main.Payment();

        payment.setNameEstablishment("Test");
        payment.setAmount(23);
        payment.setDateTime(new Date());
        payment.setCodeTransaction(231);

        AddPaymentProtocol serviceAddPaymentProtocol = AddNewPaymentFactory.maker();

        serviceAddPaymentProtocol.addNewPayment(payment);
    }
}
