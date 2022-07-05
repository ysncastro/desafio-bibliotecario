package com.yasmin.biblioteca.service;

import com.yasmin.biblioteca.domain.Livro;
import com.yasmin.biblioteca.dto.LivroDto;
import com.yasmin.biblioteca.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static com.yasmin.biblioteca.mapper.LivroMapper.toLivro;

@Service
public class LivroService {

    @Autowired
    LivroRepository repositorio;

    @Transactional
    public Livro salvar(LivroDto livroDto) {
        Livro livro = toLivro(livroDto);
        return repositorio.save(livro);
    }

}
