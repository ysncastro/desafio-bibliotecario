package com.yasmin.biblioteca.controller;

import com.yasmin.biblioteca.domain.Livro;
import com.yasmin.biblioteca.dto.LivroDto;
import com.yasmin.biblioteca.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LivroController {

    @Autowired
    LivroService livroService;

    @PostMapping("/livros")
    public ResponseEntity<Livro> salvar(@RequestBody LivroDto livroDto) {
        return new ResponseEntity<>(livroService.salvar(livroDto), HttpStatus.CREATED);
    }
}