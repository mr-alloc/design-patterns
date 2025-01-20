package io.alloc.structure.bridge.messageing;

import io.alloc.structure.bridge.messageing.abstraction.MessageSender;
import io.alloc.structure.bridge.messageing.abstraction.refined.RegularMessageSender;
import io.alloc.structure.bridge.messageing.abstraction.refined.UrgentMessageSender;
import io.alloc.structure.bridge.messageing.implementor.MessageSenderImplementor;
import io.alloc.structure.bridge.messageing.implementor.concrete.EmailPlatform;

import java.util.HashMap;
import java.util.Map;

public class MessagingUseCase {

    public static void run() {
        Map<String, String> emailSettings = new HashMap<>();
        emailSettings.put("smtp", "smtp.gmail.com");
        emailSettings.put("port", "587");

        Map<String, String> smsSettings = new HashMap<>();
        smsSettings.put("api_key", "your_api_key");
        smsSettings.put("provider", "twilio");


        MessageSenderImplementor emailPlatform = new EmailPlatform();
        MessageSenderImplementor smsPlatform = new EmailPlatform();

        emailPlatform.configureSettings(emailSettings);
        smsPlatform.configureSettings(smsSettings);

        MessageSender urgentEmailSender = new UrgentMessageSender(emailPlatform);
        MessageSender regularSMSSender = new RegularMessageSender(smsPlatform);

        urgentEmailSender.send("Server is down!", "admin@company.com");
        regularSMSSender.send("Hello, how are you?", "+1234567890");
    }

}
