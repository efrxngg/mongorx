package edu.spring.mongorx.service.impl;

import edu.spring.mongorx.model.User;
import edu.spring.mongorx.repository.UserRepository;
import edu.spring.mongorx.service.UserService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Mono<User> saveUser(User entity) {
        return userRepository.save(entity);
    }

    @Override
    public Flux<User> findAllUsers() {
        return userRepository.findAll();
    }

}
