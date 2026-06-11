package com.pragma.eventos.infrastructure;

import com.pragma.eventos.domain.Event;
import reactor.core.publisher.Mono;

public interface EventRepository {

    Mono<Event> save(Event event);
}