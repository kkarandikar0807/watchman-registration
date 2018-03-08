package com.watchman.registration.registration;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.watchman.registration.user.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.net.URISyntaxException;

@RestController
@EnableCircuitBreaker
public class RegistrationAPI {

    @Autowired
    RegistrationService service;

    private static Logger logger = LoggerFactory.getLogger(RegistrationAPI.class);

    @HystrixCommand(defaultFallback = "fallbackHystrix")
    @PostMapping(path = "/register")
    public String registerUser(@RequestBody User user) throws URISyntaxException {
        logger.info("Trying to implement dummy log");
        logger.warn("A warning message");
        logger.error("Error message log");
       return service.registerUser(user);
    }

    public String fallbackHystrix() {
        return "Fallback method called";
    }
}
