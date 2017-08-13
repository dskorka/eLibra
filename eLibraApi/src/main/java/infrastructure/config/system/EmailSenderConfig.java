package infrastructure.config.system;

import application.ports.emailSender.EmailSender;
import application.ports.emailSender.EmailSenderImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Damian on 13.08.2017
 */

@Configuration
public class EmailSenderConfig {

    @Bean
    EmailSender emailSender(){
        return new EmailSenderImpl();
    }
}
