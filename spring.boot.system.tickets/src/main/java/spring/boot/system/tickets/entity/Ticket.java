package spring.boot.system.tickets.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jdk.jshell.Snippet;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tickets")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NotBlank
    @Size(min = 5, max = 100)
    private String title;

    @Column
    @NotBlank
    @Size(min = 10, message = "minimo de 10 caracteres para abertura do ticket")
    private String description;

    @Column
    @NotBlank
    @Enumerated(value = EnumType.STRING)
    private StatusTicket statusTicket;

    @Column
    @NotBlank
    private User applicant;

    @Column
    private LocalDateTime createdIn;

    @Column
    private LocalDateTime updatedIn;

}
