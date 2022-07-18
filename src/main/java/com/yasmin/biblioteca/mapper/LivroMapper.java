package com.yasmin.biblioteca.mapper;

import com.yasmin.biblioteca.domain.Autor;
import com.yasmin.biblioteca.domain.Livro;
import com.yasmin.biblioteca.dto.LivroDto;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class LivroMapper {

    public static Livro toLivro(LivroDto livroDto) {
        return Livro.builder()
                .nome(livroDto.getNome())
                .isbn(livroDto.getIsbn())
                .autor(Autor.builder()
                        .id(livroDto.getId())
                        .build())
                .build();
    }

    public static LivroDto toLivroDto(Livro livro) {
        return LivroDto.builder()
                .id(livro.getId())
                .nome(livro.getNome())
                .isbn(livro.getIsbn())
                .idAutor(livro.getAutor().getId())
                .build();
    }
}