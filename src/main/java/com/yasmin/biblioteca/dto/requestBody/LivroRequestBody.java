package com.yasmin.biblioteca.dto.requestBody;

import com.yasmin.biblioteca.domain.Autor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LivroRequestBody {

    private String nome;
    private String isbn;
    private Autor autor;


}