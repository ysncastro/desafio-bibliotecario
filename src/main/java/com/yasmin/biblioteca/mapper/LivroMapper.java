package com.yasmin.biblioteca.mapper;

import com.yasmin.biblioteca.domain.Autor;
import com.yasmin.biblioteca.domain.Livro;
import com.yasmin.biblioteca.dto.LivroDto;
import com.yasmin.biblioteca.dto.LivroPageDto;
import org.springframework.data.domain.Page;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

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

    public LivroDto paraLivroDto(Livro livro) {
        return LivroDto.builder()
                .id(livro.getId())
                .nome(livro.getNome())
                .isbn(livro.getIsbn())
                .idAutor(livro.getAutor().getId())
                .build();
    }

    public List<LivroDto> paraListaDeLivrosDto(Collection<Livro> livros) {
        return livros.stream()
                .map(this::paraLivroDto)
                .collect(Collectors.toList());
    }

    public LivroPageDto paraLivroPageDto(Page<Livro> livrosComPaginacao) {
        return LivroPageDto.builder()
                .livroDtoList(paraListaDeLivrosDto(livrosComPaginacao.getContent()))
                .build();
    }
}