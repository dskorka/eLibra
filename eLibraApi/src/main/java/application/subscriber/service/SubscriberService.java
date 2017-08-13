package application.subscriber.service;

import application.subscriber.command.SubscriberCommand;

public interface SubscriberService {
    void sendEmailToSubscriber(SubscriberCommand command);
}
