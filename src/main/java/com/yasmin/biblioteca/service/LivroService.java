package com.yasmin.biblioteca.service;

import com.yasmin.biblioteca.domain.Autor;
import com.yasmin.biblioteca.domain.Livro;
import com.yasmin.biblioteca.dto.LivroDto;
import com.yasmin.biblioteca.exception.ApiException;
import com.yasmin.biblioteca.repository.AutorRepository;
import com.yasmin.biblioteca.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import static com.yasmin.biblioteca.mapper.LivroMapper.toLivro;
import static com.yasmin.biblioteca.mapper.LivroMapper.toLivroDto;

@Service
public class LivroService {

    @Autowired
    LivroRepository repositorio;

    @Autowired
    AutorRepository autorRepository;


    public LivroDto salvar(LivroDto livroDto) {
        Livro livro = toLivro(livroDto);
        Autor autor = autorRepository.findById(livroDto.getIdAutor()).orElseThrow(() -> new ApiException("Autor não encontrado", HttpStatus.NOT_FOUND));
        autor.adicionaLivro(livro);
        livro.setAutor(autor);
        return toLivroDto(repositorio.save(livro));
    }

    public LivroDto buscaPorIsbn(String isbnRequisitado) {
        return toLivroDto(repositorio.findByIsbn(isbnRequisitado));}

}
