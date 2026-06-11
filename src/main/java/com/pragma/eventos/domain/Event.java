package com.pragma.eventos.domain;

import java.time.Instant;

public class Event {

    private String id;
    private String source;
    private String type;
    private Instant timestamp;
    private String payload;

    public Event(String id, String source, String type, Instant timestamp, String payload) {
        this.id = id;
        this.source = source;
        this.type = type;
        this.timestamp = timestamp;
        this.payload = payload;
    }

    // Getters and setters
}