package com.watchman.registration.registration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Registration {


    @GetMapping(path = "/")
    public String test() {
        return "testing";
    }
}
