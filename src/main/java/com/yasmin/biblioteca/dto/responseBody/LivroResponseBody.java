package com.yasmin.biblioteca.dto.responseBody;


import com.yasmin.biblioteca.domain.Autor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LivroResponseBody {

    private Long id;
    private String nome;
    private String isbn;
    private Autor autor;

}
