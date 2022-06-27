package com.yasmin.biblioteca.repository;

import com.yasmin.biblioteca.dto.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

    Livro findByIsbn(String isbn);

    @Override
    Optional<Livro> findById(Long aLong);
}
