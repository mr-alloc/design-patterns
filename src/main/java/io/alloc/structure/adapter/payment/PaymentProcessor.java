package io.alloc.structure.adapter.payment;

import io.alloc.structure.adapter.payment.constant.PaymentStatus;

public class PaymentProcessor {

    private final Payment paymentSystem;

    public PaymentProcessor(Payment paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    public void process(Order order) {
        paymentSystem.processPayment(order.getTotal());
        //결제상태 확인
        PaymentStatus paymentStatus = paymentSystem.checkStatus("AE2D123-12");
        System.out.println("Payment status: " + paymentStatus);

    }
}
