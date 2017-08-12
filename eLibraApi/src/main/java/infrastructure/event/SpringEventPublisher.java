package infrastructure.event;

import application.ports.EventPublisher;
import org.springframework.context.ApplicationEventPublisher;

/**
 * Created by Damian on 12.08.2017
 */


public class SpringEventPublisher implements EventPublisher {

    private final ApplicationEventPublisher eventPublisher;

    public SpringEventPublisher(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    @Override
    public void publish(Object event) {
        eventPublisher.publishEvent(event);
    }
}
