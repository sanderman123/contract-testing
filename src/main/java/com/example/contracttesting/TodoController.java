package com.example.contracttesting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    Todo todo = new Todo("hallo", false);

    @GetMapping(value = "/todo")
    public Todo getTodo() {
        return this.todo;
    }

}
