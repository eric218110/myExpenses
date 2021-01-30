package domain.protocols.payments.add;

import domain.protocols.payments.main.Payment;

public interface AddPaymentProtocol {
    void addNewPayment(Payment payment);
}
