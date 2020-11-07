package com.project.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(path = "/user")
public class RestController {

    @Autowired
    EventsRepositry repositry;

    @GetMapping
    public String check() {
        return "Welcome";
    }
    @GetMapping(path = "/getevents")
    public List<String> getAllEvents() {
        return repositry.getAllEvents();
    }
}
