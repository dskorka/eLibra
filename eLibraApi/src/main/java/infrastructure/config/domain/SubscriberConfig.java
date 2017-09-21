package infrastructure.config.domain;

import application.ports.event.EventPublisher;
import application.subscriber.repo.JpaSubscriberRepo;
import application.subscriber.service.SubscriberService;
import application.subscriber.service.SubscriberServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

/**
 * Created by Damian on 13.08.2017
 */

@Configuration
class SubscriberConfig {

    @Bean
    SubscriberService subscriberService(JpaSubscriberRepo subscriberRepo, EventPublisher eventPublisher){
        return new SubscriberServiceImpl(subscriberRepo, eventPublisher);
    }

    @Bean("mailSender")
    public JavaMailSender getJavaMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("smtp.gmail.com");
        mailSender.setPort(587);

        mailSender.setUsername("bibliotekaelibra@gmail.com");
        mailSender.setPassword("eLibra12345");

        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.debug", "true");

        return mailSender;
    }
}
