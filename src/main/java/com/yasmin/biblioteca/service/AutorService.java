package com.yasmin.biblioteca.service;

import com.yasmin.biblioteca.dto.Autor;
import com.yasmin.biblioteca.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

@Service
public class AutorService {

    @Autowired
    AutorRepository repositorio;

    public Autor salvar(Autor autor) {return repositorio.save(autor);}

//    public Autor buscaPorId(Long id) throws ChangeSetPersister.NotFoundException {
//        return repositorio.findById(id).orElseThrow(ChangeSetPersister.NotFoundException::new);
//    }


}
