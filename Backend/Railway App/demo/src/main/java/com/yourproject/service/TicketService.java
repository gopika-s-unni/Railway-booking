package com.yourproject.service;

import com.yourproject.model.Ticket;
import com.yourproject.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    // Method to save a ticket
    public Ticket saveTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    // Method to get all tickets
    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }
}
