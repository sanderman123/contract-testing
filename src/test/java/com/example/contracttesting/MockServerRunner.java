package com.example.contracttesting;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@AutoConfigureStubRunner(ids = {"com.example:contract-testing:+:stubs:6565"}, workOffline = true)
@DirtiesContext
public class MockServerRunner {

    @Test
    public void startMockServer() {
        if (System.getProperty("runMockServer") != null) {

            System.out.println("Starting");
            try {
                Object lock = new Object();
                synchronized (lock) {
                    while (true) {
                        lock.wait();
                    }
                }
            } catch (InterruptedException ex) {
                System.out.println("Stopping");
            }
        } else {
            System.out.println("Skipping");
        }
    }
}
