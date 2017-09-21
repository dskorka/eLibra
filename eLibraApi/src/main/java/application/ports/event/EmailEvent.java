package application.ports.event;

/**
 * Created by Damian on 13.08.2017
 */

public abstract class EmailEvent implements DomainEvent {

    private final String email;
    private final String title;
    private final String content;

    public EmailEvent(String email, String title, String content) {
        this.email = email;
        this.title = title;
        this.content = content;
    }

    public String getEmail() {
        return email;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
