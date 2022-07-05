package com.yasmin.biblioteca.controller;

import com.yasmin.biblioteca.domain.Autor;
import com.yasmin.biblioteca.dto.AutorDto;
import com.yasmin.biblioteca.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AutorController {

    @Autowired
    AutorService autorService;

    @PostMapping("/autores")
    public ResponseEntity<Autor> salvar(@RequestBody AutorDto autorDto) {
        return new ResponseEntity<>(autorService.salvar(autorDto), HttpStatus.CREATED);
    }


}
