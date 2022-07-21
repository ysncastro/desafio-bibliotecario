package com.yasmin.biblioteca.controller;

import com.yasmin.biblioteca.dto.AutorDto;
import com.yasmin.biblioteca.dto.LivroDto;
import com.yasmin.biblioteca.repository.AutorRepository;
import com.yasmin.biblioteca.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.yasmin.biblioteca.mapper.AutorMapper.toAutorDto;

@RestController
@RequestMapping
public class AutorController {

    @Autowired
    AutorService autorService;

    @Autowired
    AutorRepository autorRepository;

    @PostMapping("/autores")
    public ResponseEntity<AutorDto> salvar(@RequestBody AutorDto autorDto) {
        return new ResponseEntity<>(autorService.salvar(autorDto), HttpStatus.CREATED);
    }

    @GetMapping("/autores/{id}")
    public ResponseEntity<AutorDto> buscaPorId(@PathVariable Long id) {
        return new ResponseEntity<>(autorService.buscaPorId(id), HttpStatus.OK);
    }

    @GetMapping("/autores/{idAutor}/publicacoes")
    public ResponseEntity<List<LivroDto>> buscaPublicacoesPorIdDoAutor(@PathVariable Long idAutor) {
        return new ResponseEntity<>(autorService.buscaPublicacoesPorIdDoAutor(idAutor), HttpStatus.OK);
    }


}
