package infrastructure.persistence.subscriber;

import application.subscriber.Subscriber;
import application.subscriber.repo.JpaSubscriberRepo;
import org.springframework.stereotype.Repository;

/**
 * Created by Damian on 13.08.2017
 */

@Repository
public class JpaSubscriberRepoImpl implements JpaSubscriberRepo{

    private final JpaDataSubscriberRepo repo;

    public JpaSubscriberRepoImpl(JpaDataSubscriberRepo repo) {
        this.repo = repo;
    }

    @Override
    public void save(Subscriber subscriber) {
        repo.save(subscriber);
    }
}
