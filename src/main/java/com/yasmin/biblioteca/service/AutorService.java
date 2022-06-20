package com.yasmin.biblioteca.service;

import com.yasmin.biblioteca.domain.Autor;
import com.yasmin.biblioteca.dto.requestBody.AutorRequestBody;
import com.yasmin.biblioteca.dto.responseBody.AutorResponseBody;
import com.yasmin.biblioteca.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import static com.yasmin.biblioteca.mapper.AutorMapper.toAutor;
import static com.yasmin.biblioteca.mapper.AutorMapper.toAutorResponseBody;

@Service
public class AutorService {

    private AutorRepository repositorio;

    @Autowired
    public AutorService(AutorRepository repositorio) {
        this.repositorio = repositorio;
    }

    public AutorResponseBody salvar(AutorRequestBody autorRequestBody) {
        Autor autor = toAutor(autorRequestBody);
        return toAutorResponseBody(repositorio.save(autor));
    }

}
