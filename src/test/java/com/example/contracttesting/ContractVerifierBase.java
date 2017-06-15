package com.example.contracttesting;


import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;

public class ContractVerifierBase {

    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new TodoController());
    }

}