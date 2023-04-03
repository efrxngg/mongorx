package edu.spring.mongorx;

import edu.spring.mongorx.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MongorxApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongorxApplication.class, args);
    }

    private final UserService userService;

    public MongorxApplication(UserService userService) {
        this.userService = userService;
    }

    @Bean
    public CommandLineRunner run() {
        return args -> {
            System.out.println("Mongo Async");

            userService.findAllUsers().subscribe(r -> {
                System.out.println("Start find...");
                System.out.println(r);
                System.out.println("End find!");
            }, Throwable::printStackTrace);
        };
    }
}
