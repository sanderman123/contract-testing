package com.example.contracttesting;

import com.example.contracttesting.dinges.DingesDependency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @Autowired
    DingesDependency dingesDependency;

    Todo todo = new Todo("hallo", false);

    @GetMapping(value = "/api/todo")
    public Todo getTodo() {
        return this.todo;
    }

    @GetMapping(value = "/api/dinges")
    public String getDinges() {
        return this.dingesDependency.getDinges();
    }
}
