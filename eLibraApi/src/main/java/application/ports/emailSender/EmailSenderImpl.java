package application.ports.emailSender;

import application.subscriber.event.EmailSubscriberEvent;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

/**
 * Created by Damian on 13.08.2017
 */
public class EmailSenderImpl implements EmailSender {

    private final JavaMailSender javaMailSender;

    public EmailSenderImpl(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    @Override
    public void sendEmail(EmailSubscriberEvent event) {
        SimpleMailMessage mailMessage = createSimpleMessage(event);

        javaMailSender.send(mailMessage);
    }

    private SimpleMailMessage createSimpleMessage(EmailSubscriberEvent event){
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(event.getEmail());
        mailMessage.setSubject(event.getTitle());
        mailMessage.setText(event.getContent());

        return mailMessage;
    }
}