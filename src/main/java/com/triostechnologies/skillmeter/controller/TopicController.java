package com.triostechnologies.skillmeter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
    @GetMapping(value = "/topics")
    public String getTopics() {
        return "Success";
    }
}
