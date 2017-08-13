package application.ports;

import application.ports.event.DomainEvent;

public interface EventPublisher {
    void publish(DomainEvent event);
}
