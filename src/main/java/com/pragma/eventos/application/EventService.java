package com.pragma.eventos.application;

import com.pragma.eventos.domain.Event;
import com.pragma.eventos.infrastructure.EventRepository;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class EventService {

    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @CircuitBreaker(name = "eventService", fallbackMethod = "fallbackSaveEvent")
    public Mono<Event> processEvent(Event event) {
        return eventRepository.save(event);
    }

    public Mono<Event> fallbackSaveEvent(Event event, Throwable throwable) {
        return Mono.error(throwable);
    }
}