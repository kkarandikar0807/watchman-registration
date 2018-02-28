package com.watchman.registration.registration;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.watchman.registration.user.User;
import constants.ConstantRoutes;
import helpers.UrlBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.io.IOException;
import java.net.*;

@Service
public class RegistrationService {

    @Value("${url}")
    private String url;


    protected String registerUser(User user) throws IOException, URISyntaxException {
        String endpoint = ConstantRoutes.register;
        URI obj = new URI(UrlBuilder.buildUrl(this.url, endpoint));
        RestTemplate restTemplate = new RestTemplate();
        String success = restTemplate.postForObject(obj, user, String.class);
        return "Response Code : - " +success;
    }
}
