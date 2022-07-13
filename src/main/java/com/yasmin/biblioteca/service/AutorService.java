package com.yasmin.biblioteca.service;

import com.yasmin.biblioteca.domain.Autor;
import com.yasmin.biblioteca.dto.AutorDto;
import com.yasmin.biblioteca.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.yasmin.biblioteca.mapper.AutorMapper.toAutor;

@Service
public class AutorService {

    @Autowired
    AutorRepository repositorio;

    public Autor salvar(AutorDto autorDto) {
        Autor autor = toAutor(autorDto);
        return repositorio.save(autor);
    }

}
