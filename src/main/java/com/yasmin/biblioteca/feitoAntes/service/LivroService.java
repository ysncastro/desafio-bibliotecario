//package com.yasmin.biblioteca.service;
//
//import com.yasmin.biblioteca.dto.Livro;
//import com.yasmin.biblioteca.repository.LivroRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class LivroService {
//
//    @Autowired
//    LivroRepository repositorio;
//
//    public Livro salvar(Livro livro) {
//        return repositorio.save(livro);
//    }
//
//    public Livro buscaPorIsbn(String isbnRequisitado) {
//        return repositorio.findByIsbn(isbnRequisitado);}
//
//    public Livro buscaPorId(Long id) {
//        return repositorio.findById(id).orElseThrow();
//    }
//
//
//    public Livro atualizar(Livro livroNovo, Long id) {
//        Livro livro = buscaPorId(id);
//        repositorio.save(livro.builder()
//                .id(id)
//                .nome(livroNovo.getNome())
//                .isbn(livroNovo.getIsbn())
//                .build());
//        return livro;
//    }
//
//    public void deletar(Long id) {
//        repositorio.deleteById(id);
//    }

    //    public Livro atualizar(Livro livroNovo, Long id) {
//        Livro livro = buscaPorId(id);
//        livro.setNome(livroNovo.getNome());
//        livro.setIsbn(livroNovo.getIsbn());
//        repositorio.save(livro);
//        return livro;
//    }


//}
