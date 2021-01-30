package presentation.services.payment.add;

import domain.protocols.payments.add.AddPaymentProtocol;
import domain.protocols.payments.main.Payment;
import domain.protocols.payments.main.PaymentProtocols;

public class ServiceAddPayment implements AddPaymentProtocol {

    private PaymentProtocols paymentList;

    public ServiceAddPayment(PaymentProtocols paymentProtocols){
        this.paymentList = paymentProtocols;
    }

    @Override
    public void addNewPayment(Payment payment) {
        this.paymentList.setPaymentList(payment);
    }
}
