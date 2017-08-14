package application.subscriber.event;

import application.ports.event.EmailEvent;

/**
 * Created by Damian on 13.08.2017
 */

public class EmailSubscriberEvent extends EmailEvent {

    public EmailSubscriberEvent(String email, String title, String content) {
        super(email, title, content);
    }
}
