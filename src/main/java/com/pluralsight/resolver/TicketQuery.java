package com.pluralsight.resolver;

import org.springframework.stereotype.Component;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.pluralsight.entity.Ticket;
import com.pluralsight.repository.TicketRepository;

@Component
public class TicketQuery implements GraphQLQueryResolver {
    private TicketRepository ticketRepository;

    public TicketQuery (TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public Iterable<Ticket> findAllTickets() {
        return ticketRepository.findAll();
    }
    
    public long countTickets() {
        return ticketRepository.count();
    }
}
