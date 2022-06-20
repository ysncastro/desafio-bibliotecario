package com.yasmin.biblioteca.dto.requestBody;

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
public class AutorRequestBody {

    private String nome;

    private List<Livro> publicacoes;

}