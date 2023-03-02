package it.corso.mygym.dao;

import it.corso.mygym.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByActivatedTrue();

    // TODO: find by activeFlag=true AND have an active subscription --> @query
    @Query("SELECT u FROM User u WHERE u.activated=true AND u.endSubscription>02/03/2023")
    List<User> findActivatedTrueAndActiveSubscription();
}
