package com.yasmin.biblioteca.domain;

import lombok.*;

import javax.persistence.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String isbn;

    @OneToOne
    @JoinColumn(name = "autor_id")
    private Autor autor;

}
