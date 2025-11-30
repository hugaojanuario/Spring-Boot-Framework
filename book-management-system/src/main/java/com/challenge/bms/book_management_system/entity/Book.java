package com.challenge.bms.book_management_system.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column
    @NotBlank
    private String title;

    @Column
    @NotBlank
    private String author;

    @Column
    @NotBlank
    private String isbn;

    @Column
    @Min(value = 1500, message = "Somente sao aceitos livros a partir de 1500")
    @Max(value = 2025, message = "Somente sao aceitos livros até 2025")
    private Integer publicationYear;


}
