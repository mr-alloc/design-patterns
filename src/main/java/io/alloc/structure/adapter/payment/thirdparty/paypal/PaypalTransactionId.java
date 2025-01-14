package io.alloc.structure.adapter.payment.thirdparty.paypal;

public class PaypalTransactionId {

    private final String value;

    public PaypalTransactionId(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
