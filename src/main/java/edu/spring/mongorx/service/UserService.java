package edu.spring.mongorx.service;

import edu.spring.mongorx.model.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {
    Mono<User> saveUser(User entity);

    Flux<User> findAllUsers();
}
