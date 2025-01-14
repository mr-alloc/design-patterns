package io.alloc.structure.adapter.payment.implement;

import io.alloc.structure.adapter.payment.Payment;
import io.alloc.structure.adapter.payment.constant.PaymentStatus;

public class LegacyPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of amount: " + amount + "via legacy system");
    }

    @Override
    public PaymentStatus checkStatus(String paymentId) {
        return PaymentStatus.COMPLETED;
    }

}
