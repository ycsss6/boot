package org.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Boot2Controller {
    @Autowired
    private Person person;

    @RequestMapping("/hello")
    public Person hello() {
        return person;
    }
}
