package application.ports.emailSender;

import application.subscriber.event.EmailSubscriberEvent;

public interface EmailSender {
    void sendEmail(EmailSubscriberEvent event);
}
