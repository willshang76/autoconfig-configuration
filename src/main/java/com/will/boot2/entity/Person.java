package com.will.boot2.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "person")
@Component
@Data
@ToString
public class Person {
    private String userName;
    private Integer age;
    private Date boa;
    private List<String> hobbies;
    private Dpt dpt;
    private boolean boss;
    private Map<String, Dpt> allDpts;
}
