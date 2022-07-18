package com.yasmin.biblioteca.controller;

import com.yasmin.biblioteca.domain.Livro;
import com.yasmin.biblioteca.dto.LivroDto;
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
    public ResponseEntity<LivroDto> salvar(@RequestBody LivroDto livroDto) {
        return new ResponseEntity<>(livroService.salvar(livroDto), HttpStatus.CREATED);
    }

    @GetMapping("/livros")
    public ResponseEntity<LivroDto> buscaPorIsbn(@RequestParam String isbn) {
        return new ResponseEntity<>(livroService.buscaPorIsbn(isbn), HttpStatus.OK);
    }

}