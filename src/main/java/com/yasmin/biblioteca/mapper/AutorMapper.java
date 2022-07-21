package com.yasmin.biblioteca.mapper;

import com.yasmin.biblioteca.domain.Autor;
import com.yasmin.biblioteca.domain.Livro;
import com.yasmin.biblioteca.dto.AutorDto;
import com.yasmin.biblioteca.dto.LivroDto;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
public abstract class AutorMapper {

    public static Autor toAutor(AutorDto autorDto) {
        return Autor.builder()
                .nome(autorDto.getNome())
//                .publicacoes(autorDto.getPublicacoes())
                .build();
    }

    public static AutorDto toAutorDto(Autor autor) {
        return AutorDto.builder()
                .id(autor.getId())
                .nome(autor.getNome())
//                .publicacoes(autor.getPublicacoes())
                .build();
    }

}