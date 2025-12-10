package spring.boot.system.tickets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.boot.system.tickets.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
