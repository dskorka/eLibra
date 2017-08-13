package application.ports.event;

/**
 * Created by Damian on 13.08.2017
 */


public abstract class EmailEvent implements DomainEvent {

    private String email;
    private String title;
    private String content;

    public EmailEvent(String email, String title, String content) {
        this.email = email;
        this.title = title;
        this.content = content;
    }
}
