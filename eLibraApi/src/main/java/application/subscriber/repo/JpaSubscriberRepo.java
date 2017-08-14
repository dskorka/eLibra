package application.subscriber.repo;

import application.subscriber.Subscriber;

public interface JpaSubscriberRepo {
    void save(Subscriber subscriber);
}