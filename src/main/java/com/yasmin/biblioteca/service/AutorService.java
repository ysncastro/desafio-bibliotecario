package com.yasmin.biblioteca.service;

import com.yasmin.biblioteca.domain.Autor;
import com.yasmin.biblioteca.domain.Livro;
import com.yasmin.biblioteca.dto.AutorDto;
import com.yasmin.biblioteca.dto.LivroDto;
import com.yasmin.biblioteca.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.yasmin.biblioteca.mapper.AutorMapper.toAutor;
import static com.yasmin.biblioteca.mapper.AutorMapper.toAutorDto;
import static com.yasmin.biblioteca.mapper.LivroMapper.toListaDeLivrosDto;

@Service
public class AutorService {

    @Autowired
    AutorRepository repositorio;

    public AutorDto salvar(AutorDto autorDto) {
        Autor autor = toAutor(autorDto);
        return toAutorDto(repositorio.save(autor));
    }

    public AutorDto buscaPorId(Long id) {
        return toAutorDto(repositorio.findById(id).orElseThrow());
    }

    public List<LivroDto> buscaPublicacoesPorIdDoAutor(Long id) {
        Autor autor = repositorio.findById(id).orElseThrow();
        List<Livro> publicacoesAutor = autor.getPublicacoes();
        return toListaDeLivrosDto(publicacoesAutor);
    }

}
