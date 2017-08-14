package application.subscriber.command;

import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.NotNull;

/**
 * Created by Damian on 13.08.2017
 */

public class SubscriberCommand {

    @NotNull
    @Email(message = "Podaj prawidłowy adres e-mail")
    private String emailSubscriber;

    public SubscriberCommand(String emailSubscriber) {
        this.emailSubscriber = emailSubscriber;
    }

    public String getEmailSubscriber() {
        return emailSubscriber;
    }
}