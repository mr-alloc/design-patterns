package io.alloc.structure.adapter.payment;

import io.alloc.structure.adapter.payment.constant.PaymentStatus;

public interface Payment {

    void processPayment(double amount);

    PaymentStatus checkStatus(String paymentId);
}
