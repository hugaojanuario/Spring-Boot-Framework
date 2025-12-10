package spring.boot.system.tickets.service;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import spring.boot.system.tickets.entity.Ticket;
import spring.boot.system.tickets.repository.TicketRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TicketService {

    private final TicketRepository ticketRepository;

    public Ticket newTicket (Ticket ticket){
        return ticketRepository.save(ticket);
    }

    public List <Ticket> listTicket (){
        return ticketRepository.findAll();
    }

    public Optional<Ticket> listTicketById(Long id){
        return ticketRepository.findById(id);
    }

    public void deleteTicketById(Long id){
        ticketRepository.deleteById(id);
    }


}
