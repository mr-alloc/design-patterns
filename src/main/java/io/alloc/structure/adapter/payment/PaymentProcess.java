package io.alloc.structure.adapter.payment;

import io.alloc.structure.adapter.payment.implement.LegacyPayment;
import io.alloc.structure.adapter.payment.implement.PaypalAdapter;
import io.alloc.structure.adapter.payment.thirdparty.paypal.PayPalAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PaymentProcess {

    public static void run(Order order) {
        PaymentProcessor processor = LocalDate.now().isBefore(LocalDate.of(2021, 4, 13))
                ? new PaymentProcessor(new LegacyPayment())
                : new PaymentProcessor(new PaypalAdapter(new PayPalAPI()));

        processor.process(order);
    }

}
