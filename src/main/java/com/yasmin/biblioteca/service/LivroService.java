package com.yasmin.biblioteca.service;

import com.yasmin.biblioteca.domain.Autor;
import com.yasmin.biblioteca.domain.Livro;
import com.yasmin.biblioteca.dto.LivroDto;
import com.yasmin.biblioteca.dto.LivroPageDto;
import com.yasmin.biblioteca.exception.ApiException;
import com.yasmin.biblioteca.mapper.LivroMapper;
import com.yasmin.biblioteca.repository.AutorRepository;
import com.yasmin.biblioteca.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import static com.yasmin.biblioteca.mapper.LivroMapper.toLivro;

@Service
public class LivroService {

    @Autowired
    LivroRepository repositorio;

    @Autowired
    AutorRepository autorRepository;


    public Livro salvar(LivroDto livroDto) {
        Livro livro = toLivro(livroDto);
        Autor autor = autorRepository.findById(livroDto.getIdAutor()).orElseThrow(() -> new ApiException("Autor não encontrado", HttpStatus.NOT_FOUND));
        livro.setAutor(autor);
//        autor.adicionaLivro(livro);
        return repositorio.save(livro);
    }

    public LivroPageDto listaLivrosComPaginacao(int pagina, int tribosPorPagina) {
        return new LivroMapper().paraLivroPageDto(
                repositorio.findAll(PageRequest.of(pagina, tribosPorPagina, Sort.by("nome"))));
    }

}
