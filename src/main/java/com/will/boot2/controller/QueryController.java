package com.will.boot2.controller;

import com.will.boot2.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryController {

    @Autowired
    private Person person;

    @GetMapping("/query")
    public Person query(){
        return person;
    }
}
