package com.yasmin.biblioteca.controller;

import com.yasmin.biblioteca.dto.Livro;
import com.yasmin.biblioteca.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
public class LivroController {

    @Autowired
    LivroService livroService;

    @PostMapping("/livros")
    public ResponseEntity<Livro> criarv1(@RequestBody Livro novoLivro) {
        Livro livroSalvo = livroService.salvar(novoLivro);
        return new ResponseEntity<>(livroSalvo, HttpStatus.CREATED);
    }

    @PostMapping("v2/livros")
    public ResponseEntity criar(@RequestBody Livro novoLivro) throws URISyntaxException {
        Livro livroSalvo = livroService.salvar(novoLivro);
        return ResponseEntity.created(new URI("/livros/"+livroSalvo.getId())).build();
    }

    @GetMapping("/livros")
    public ResponseEntity<Livro> buscaPorIsbn(@RequestParam String isbn) {
        return new ResponseEntity<>(livroService.buscaPorIsbn(isbn), HttpStatus.OK);
    }

    @GetMapping("/livros/{id}")
    public ResponseEntity buscaPorId(@PathVariable Long id) {
        return new ResponseEntity(livroService.buscaPorId(id), HttpStatus.OK);
    }

    @DeleteMapping("/livros/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        livroService.deletar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

//    @PutMapping("/livros/{id}")
//    public ResponseEntity atualizar(@RequestBody Livro livroNovo, @PathVariable Long id) {
//        return new ResponseEntity(livroService.atualizar(livroNovo, id), HttpStatus.OK);
//    }

}