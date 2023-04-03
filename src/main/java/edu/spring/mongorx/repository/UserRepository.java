package edu.spring.mongorx.repository;

import edu.spring.mongorx.model.User;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserRepository extends ReactiveMongoRepository<User, String> {
    @Query("{$gte: {inputQuantity: 1}}")
    Flux<User> findAllByInputQuantity();

    Mono<Long> count();
}
