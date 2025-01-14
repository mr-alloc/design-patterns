package io.alloc.structure.adapter.payment.thirdparty.paypal;

import io.alloc.structure.adapter.payment.constant.PayPalPaymentStatus;

public class PayPalAPI {

    public void makePayment(PayPalPaymentRequest request) {
        System.out.println("Making PayPal payment of " + request.getAmount());
    }

    public PayPalPaymentStatus getPaymentStatus(PaypalTransactionId txId) {
        return PayPalPaymentStatus.SUCCESS;
    }
}
