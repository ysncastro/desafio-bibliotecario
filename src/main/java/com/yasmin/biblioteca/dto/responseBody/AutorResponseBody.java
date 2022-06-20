package com.yasmin.biblioteca.dto.responseBody;

import com.yasmin.biblioteca.domain.Livro;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AutorResponseBody {

    private Long id;

    private String nome;

    private List<Livro> publicacoes;

}