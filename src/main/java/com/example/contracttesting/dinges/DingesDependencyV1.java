package com.example.contracttesting.dinges;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("!mocks")
public class DingesDependencyV1 implements DingesDependency {
    public String getDinges() {
        return "dinges";
    }
}
