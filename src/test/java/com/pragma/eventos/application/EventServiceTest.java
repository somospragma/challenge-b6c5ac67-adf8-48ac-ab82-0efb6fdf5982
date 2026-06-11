package com.pragma.eventos.application;

import com.pragma.eventos.domain.Event;
import com.pragma.eventos.infrastructure.EventRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class EventServiceTest {

    @Autowired
    private EventService eventService;

    @MockBean
    private EventRepository eventRepository;

    @Test
    public void testProcessEvent() {
        Event event = new Event("1", "source", "type", Instant.now(), "payload");
        Mockito.when(eventRepository.save(event)).thenReturn(Mono.just(event));

        StepVerifier.create(eventService.processEvent(event))
               .expectNext(event)
               .verifyComplete();
    }
}