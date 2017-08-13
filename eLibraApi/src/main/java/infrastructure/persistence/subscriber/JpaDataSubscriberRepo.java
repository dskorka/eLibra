package infrastructure.persistence.subscriber;

import application.subscriber.Subscriber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaDataSubscriberRepo extends JpaRepository<Subscriber, Long> {
}
