package io.alloc.structure.adapter.payment.thirdparty.paypal;

public class PayPalPaymentRequest {

    private final double amount;

    public PayPalPaymentRequest(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
