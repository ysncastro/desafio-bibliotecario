package com.yasmin.biblioteca.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@Entity
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Livro> publicacoes;

    public void adicionaLivro(Livro livro) {
        this.publicacoes.add(livro);
    }

}
