package it.corso.mygym.dao;

import it.corso.mygym.model.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {

    // TODO: find by paid=true

    // TODO: find by active subscription
}
