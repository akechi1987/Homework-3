package com.project.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EventsRepositry {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<String> getAllEvents() {
        List<String> eventsList = new ArrayList<>();

        eventsList.addAll(jdbcTemplate.queryForList("select description from events", String.class));
        return eventsList;
    }
}
