package com.yasmin.biblioteca.controller;

import com.yasmin.biblioteca.domain.Autor;
import com.yasmin.biblioteca.dto.AutorDto;
import com.yasmin.biblioteca.repository.AutorRepository;
import com.yasmin.biblioteca.service.AutorService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.yasmin.biblioteca.mapper.AutorMapper.toAutorDto;

@RestController
@RequestMapping
public class AutorController {

    @Autowired
    AutorService autorService;

    @Autowired
    AutorRepository autorRepository;

    @PostMapping("/autores")
    public ResponseEntity<Autor> salvar(@RequestBody AutorDto autorDto) {
        return new ResponseEntity<>(autorService.salvar(autorDto), HttpStatus.CREATED);
    }

    @GetMapping("/autores/{id}")
    public AutorDto buscaPorId(@PathVariable Long id) {
        return toAutorDto(autorRepository.findById(id).get());
    }

}
