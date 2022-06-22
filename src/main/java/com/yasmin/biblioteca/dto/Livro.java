package com.yasmin.biblioteca.dto;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Builder
@Getter
@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String isbn;

    private Livro(Long id, String nome, String isbn) {
        this.id = id;
        this.nome = nome;
        this.isbn = isbn;
    }

    private Livro() {
    }

}
