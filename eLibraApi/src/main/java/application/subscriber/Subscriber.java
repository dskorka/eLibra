package application.subscriber;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by Damian on 13.08.2017
 */

@Entity
@Table(name = "subscriber")
public class Subscriber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "subscriber")
    private String subscriberEmail;

    @Column(name = "subscribe_date")
    private LocalDateTime subscribeDate;

    Subscriber(){}

    public Subscriber(String emailSubscriber, LocalDateTime subscribeDate) {
        this.subscriberEmail = emailSubscriber;
        this.subscribeDate = subscribeDate;
    }
}