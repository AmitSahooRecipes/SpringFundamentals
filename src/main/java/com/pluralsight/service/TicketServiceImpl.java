package com.pluralsight.service;

import com.pluralsight.entity.Ticket;
import com.pluralsight.repository.TicketRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public List<Ticket> listTickets() {
        return (List<Ticket>) ticketRepository.findAll();
    }

}

