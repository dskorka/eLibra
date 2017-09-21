package application.subscriber.service;

import application.ports.event.EventPublisher;
import application.subscriber.Subscriber;
import application.subscriber.command.SubscriberCommand;
import application.subscriber.event.EmailSubscriberEvent;
import application.subscriber.repo.JpaSubscriberRepo;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

/**
 * Created by Damian on 13.08.2017
 */

public class SubscriberServiceImpl implements SubscriberService {

    private final JpaSubscriberRepo subscriberRepo;
    private final EventPublisher eventPublisher;

    public SubscriberServiceImpl(JpaSubscriberRepo subscriberRepo, EventPublisher eventPublisher) {
        this.subscriberRepo = subscriberRepo;
        this.eventPublisher = eventPublisher;
    }

    @Override
    @Transactional
    public void sendEmailToSubscriber(SubscriberCommand command) {
        subscriberRepo.save(new Subscriber(command.getEmailSubscriber()));

        eventPublisher.publish(
                new EmailSubscriberEvent(command.getEmailSubscriber(),
                        "Witaj w naszej subskrypcji",
                        "Witaj uzytkowniku! Zostales dodany do listy mailingowej"
                )
        );
    }
}
