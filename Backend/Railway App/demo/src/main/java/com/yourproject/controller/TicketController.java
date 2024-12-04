package com.yourproject.controller;

import com.yourproject.model.Ticket;
import com.yourproject.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tickets")
@CrossOrigin(origins = "http://localhost:4200")  // Allow cross-origin requests from your Angular app
public class TicketController {

    @Autowired
    private TicketService ticketService;

    // Endpoint to create a ticket
    @PostMapping
    public Ticket createTicket(@RequestBody Ticket ticket) {
        return ticketService.saveTicket(ticket);
    }

    // Endpoint to get all tickets
    @GetMapping
    public List<Ticket> getTickets() {
        return ticketService.getAllTickets();
    }
}
