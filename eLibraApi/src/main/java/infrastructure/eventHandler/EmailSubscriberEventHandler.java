package infrastructure.eventHandler;

import application.ports.emailSender.EmailSender;
import application.subscriber.event.EmailSubscriberEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Created by Damian on 13.08.2017
 */

@Component
class EmailSubscriberEventHandler {

    private final EmailSender emailSender;

    EmailSubscriberEventHandler(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    @EventListener
    void handle(EmailSubscriberEvent event){
        emailSender.sendEmail(event);
    }
}