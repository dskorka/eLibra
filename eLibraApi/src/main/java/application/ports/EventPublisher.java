package application.ports;

public interface EventPublisher {
    void publish(Object event);
}
