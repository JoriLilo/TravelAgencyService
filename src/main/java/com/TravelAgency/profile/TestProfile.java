package com.TravelAgency.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("!dev")
public class TestProfile {

    public TestProfile() {
        System.out.println("proof");
    }
}

