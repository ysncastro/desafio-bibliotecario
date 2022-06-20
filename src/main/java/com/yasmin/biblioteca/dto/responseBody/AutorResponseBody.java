package com.yasmin.biblioteca.dto.responseBody;

import com.yasmin.biblioteca.domain.Livro;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class AutorResponseBody {

    private Long id;

    private String nome;

    private List<Livro> publicacoes;

}