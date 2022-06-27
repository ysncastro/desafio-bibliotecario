package com.yasmin.biblioteca.service;

import com.yasmin.biblioteca.dto.Livro;
import com.yasmin.biblioteca.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LivroService {

    @Autowired
    LivroRepository repositorio;

    public Livro salvar(Livro livro) {
        return repositorio.save(livro);
    }

//    public void atualizar(Livro livro, Long id) {
//        Optional livroAntigo = buscaPorId(id);
//    }

    public void deletar(Long id) {
        repositorio.deleteById(id);
    }

    public Livro buscaPorIsbn(String isbnRequisitado) {
        return repositorio.findByIsbn(isbnRequisitado);}

    public Optional<Livro> buscaPorId(Long id) {
        return repositorio.findById(id);
    }
}
