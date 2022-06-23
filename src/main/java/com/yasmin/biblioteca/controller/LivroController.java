package com.yasmin.biblioteca.controller;

import com.yasmin.biblioteca.dto.Livro;
import com.yasmin.biblioteca.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class LivroController {

    @Autowired
    LivroService livroService;

    @PostMapping("/livros")
    public ResponseEntity<Livro> criar(@RequestBody Livro novoLivro) {
        Livro livroSalvo = livroService.salvar(novoLivro);
        return new ResponseEntity<>(livroSalvo, HttpStatus.CREATED);
    }

    @GetMapping("/livros")
    public ResponseEntity<Livro> buscaPorIsbn(@RequestParam String isbn) {
        return new ResponseEntity<>(livroService.buscaPorIsbn(isbn), HttpStatus.OK);
    }

}