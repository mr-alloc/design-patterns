package io.alloc.structure.adapter.payment.implement;

import io.alloc.structure.adapter.payment.Payment;
import io.alloc.structure.adapter.payment.constant.PayPalPaymentStatus;
import io.alloc.structure.adapter.payment.constant.PaymentStatus;
import io.alloc.structure.adapter.payment.thirdparty.paypal.PayPalAPI;
import io.alloc.structure.adapter.payment.thirdparty.paypal.PayPalPaymentRequest;
import io.alloc.structure.adapter.payment.thirdparty.paypal.PaypalTransactionId;

public class PaypalAdapter implements Payment {

    private final PayPalAPI payPalAPI;

    public PaypalAdapter(PayPalAPI payPalAPI) {
        this.payPalAPI = payPalAPI;
    }

    @Override
    public void processPayment(double amount) {
        PayPalPaymentRequest request = new PayPalPaymentRequest(amount);
        payPalAPI.makePayment(request);
    }

    @Override
    public PaymentStatus checkStatus(String paymentId) {
        PaypalTransactionId txId = new PaypalTransactionId(paymentId);
        PayPalPaymentStatus paymentStatus = payPalAPI.getPaymentStatus(txId);

        return convertPayPalStatus(paymentStatus);
    }

    private PaymentStatus convertPayPalStatus(PayPalPaymentStatus payPalPaymentStatus) {
        switch (payPalPaymentStatus) {
            case SUCCESS:
                return PaymentStatus.COMPLETED;
            case PENDING:
                return PaymentStatus.PENDING;
            case REFUND_SUCCESS:
                return PaymentStatus.REFUNDED;
            case CANCELLED:
                return PaymentStatus.CANCELLED;
            default:
                return PaymentStatus.FAILED;
        }
    }
}
