package com.yasmin.biblioteca.mapper;

import com.yasmin.biblioteca.domain.Livro;
import com.yasmin.biblioteca.dto.LivroDto;

public abstract class LivroMapper {

    public static Livro toLivro(LivroDto livroDto) {
        return Livro.builder()
                .nome(livroDto.getNome())
                .isbn(livroDto.getIsbn())
//                .autor(livroRequest.getAutor())
                .build();
    }

    public static LivroDto toLivroDto(Livro livro) {
        return LivroDto.builder()
                .id(livro.getId())
                .nome(livro.getNome())
                .isbn(livro.getIsbn())
//                .autor(livro.getAutor())
                .build();
    }
}