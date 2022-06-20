package com.yasmin.biblioteca.mapper;

import com.yasmin.biblioteca.domain.Autor;
import com.yasmin.biblioteca.dto.requestBody.AutorRequestBody;
import com.yasmin.biblioteca.dto.responseBody.AutorResponseBody;

public abstract class AutorMapper {

    public static Autor toAutor(AutorRequestBody autorRequestBody) {
        return Autor.builder()
                .nome(autorRequestBody.getNome())
                .publicacoes(autorRequestBody.getPublicacoes())
                .build();
    }

    public static AutorResponseBody toAutorResponseBody(Autor autor) {
        return AutorResponseBody.builder()
                .nome(autor.getNome())
                .publicacoes(autor.getPublicacoes())
                .build();
    }

}
