package com.yasmin.biblioteca.mapper;

import com.yasmin.biblioteca.domain.Autor;
import com.yasmin.biblioteca.dto.AutorDto;
import lombok.NoArgsConstructor;


@NoArgsConstructor
public abstract class AutorMapper {

    public static Autor toAutor(AutorDto autorDto) {
        return Autor.builder()
                .nome(autorDto.getNome())
//                .publicacoes(autorRequest.getPublicacoes())
                .build();
    }

    public static AutorDto toAutorDto(Autor autor) {
        return AutorDto.builder()
                .id(autor.getId())
                .nome(autor.getNome())
//               .publicacoes(autor.getPublicacoes())
                .build();
    }
}