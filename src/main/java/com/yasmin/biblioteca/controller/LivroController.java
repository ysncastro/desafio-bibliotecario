package com.yasmin.biblioteca.controller;

import com.yasmin.biblioteca.domain.Livro;
import com.yasmin.biblioteca.dto.LivroDto;
import com.yasmin.biblioteca.dto.LivroPageDto;
import com.yasmin.biblioteca.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class LivroController {

    @Autowired
    LivroService livroService;

    @GetMapping("v2/tribos")
    public LivroPageDto listaLivrosPaginacao(@RequestParam int pagina, @RequestParam int quantidadeDeLivrosPorPagina) {
        return livroService.listaLivrosComPaginacao(pagina, quantidadeDeLivrosPorPagina);
    }


    @PostMapping("/livros")
    public ResponseEntity<Livro> salvar(@RequestBody LivroDto livroDto) {
        return ResponseEntity.ok().body((livroService.salvar(livroDto)));
    }
}