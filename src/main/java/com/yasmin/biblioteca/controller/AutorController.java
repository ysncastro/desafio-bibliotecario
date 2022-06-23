package com.yasmin.biblioteca.controller;

import com.yasmin.biblioteca.dto.Autor;
import com.yasmin.biblioteca.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutorController {

    @Autowired
    AutorService service;

    @PostMapping("/autores")
    public ResponseEntity<Autor> criar(@RequestBody Autor novoAutor) {
        Autor autor = service.salvar(novoAutor);
        return new ResponseEntity<Autor>(autor,HttpStatus.CREATED);
    }

}
