package com.watchman.registration.registration;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.watchman.registration.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URISyntaxException;

@RestController
public class RegistrationAPI {

    @Autowired
    RegistrationService service;


    @HystrixCommand(fallbackMethod = "test")
    @PostMapping(path = "/register")
    public String registerUser(@RequestBody User user) throws IOException, URISyntaxException {

       return service.registerUser(user);
    }

    public String test() {
        return "Fallback method called";
    }
}
