package com.yasmin.biblioteca.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yasmin.biblioteca.dto.Livro;
import com.yasmin.biblioteca.service.LivroService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(LivroController.class)
public class LivroControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    private LivroController livroController;

    @MockBean
    LivroService livroService;

    private ObjectMapper mapper = new ObjectMapper();
    private Livro livroExemplo;
//    private String retornoComoJson;
    private String envioComoJSON;

    public static Livro gerarLivro() {
        return Livro.builder()
                .id(1L)
                .nome("João das Couves")
                .isbn("12345")
                .build();
    }

    @BeforeEach
    public void inicializar() throws JsonProcessingException {

        Livro livroExemplo = gerarLivro();
        envioComoJSON = mapper.writeValueAsString(livroExemplo);
//        retornoComoJson = mapper.writeValueAsString(livroExemplo);

    }


    @DisplayName("Teste POST/Sucesso")
    @Test
    public void deveriaCriarUmLivro() throws Exception {
        mockMvc.perform(post("/livros")
                        .content(envioComoJSON)
                        .accept(MediaType.APPLICATION_JSON_VALUE)
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
                )
                .andExpect(status().isCreated());
    }

}
