package infrastructure.config.domain;

import application.ports.event.EventPublisher;
import application.subscriber.repo.JpaSubscriberRepo;
import application.subscriber.service.SubscriberService;
import application.subscriber.service.SubscriberServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Damian on 13.08.2017
 */

@Configuration
class SubscriberConfig {

    @Bean
    SubscriberService subscriberService(JpaSubscriberRepo subscriberRepo, EventPublisher eventPublisher){
        return new SubscriberServiceImpl(subscriberRepo, eventPublisher);
    }
}
