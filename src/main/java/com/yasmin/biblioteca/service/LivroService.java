package com.yasmin.biblioteca.service;

import com.yasmin.biblioteca.dto.Livro;
import com.yasmin.biblioteca.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService {

    @Autowired
    LivroRepository repositorio;

    public Livro salvar(Livro livro) {
        return repositorio.save(livro);
    }
}
