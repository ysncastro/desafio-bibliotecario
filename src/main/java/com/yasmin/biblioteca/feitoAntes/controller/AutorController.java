//package com.yasmin.biblioteca.controller;
//
//import com.yasmin.biblioteca.domain.Autor;
//import com.yasmin.biblioteca.service.AutorService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//public class AutorController {
//
//    @Autowired
//    AutorService service;
//
//    @PostMapping("/autores")
//    public ResponseEntity<Autor> criar(@RequestBody Autor novoAutor) {
//        Autor autor = service.salvar(novoAutor);
//        return new ResponseEntity<Autor>(autor,HttpStatus.CREATED);
//    }

//    @GetMapping("/autores/{id}")
//    public ResponseEntity<Autor> buscaPorId(@PathVariable Long id) throws ChangeSetPersister.NotFoundException {
//        return new ResponseEntity<>(service.buscaPorId(id), HttpStatus.OK);
//    }

//}
