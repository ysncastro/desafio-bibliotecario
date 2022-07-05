//package com.yasmin.biblioteca.controller;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.yasmin.biblioteca.dto.Livro;
//import com.yasmin.biblioteca.service.LivroService;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//
//
//import static org.hamcrest.Matchers.equalTo;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
//@WebMvcTest(LivroController.class)
//public class LivroControllerTest {
//
//    @Autowired
//    MockMvc mvc;
//
//    @Autowired
//    private ObjectMapper objectMapper;
//
//    @Autowired
//    private LivroController livroController;
//
//    @MockBean
//    LivroService livroService;
//
//    @Test
//    void deveriaInserirUmLivroNoSistema() throws Exception {
//        Livro livro = new Livro("Chapéuzinho Vermelho", "2198219");
//        when(livroService.salvar(livro)).thenReturn(livro);
//        mvc.perform(post("/livros")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(objectMapper.writeValueAsString(livro))
//                )
//                .andExpect(status().isCreated())
//                .andExpect(jsonPath("nome", equalTo("Chapéuzinho Vermelho")))
//                .andExpect(jsonPath("isbn", equalTo("2198219")));
//    }
//
//    @Test
//    void deveriaBuscarUmLivroPorIsbn() throws Exception {
//        Livro livro = new Livro("Chapéuzinho Vermelho", "2198219");
//
//        when(livroService.buscaPorIsbn("2198219")).thenReturn(livro);
//
//        mvc.perform(get("/livros?isbn=2198219")
//                )
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("nome", equalTo("Chapéuzinho Vermelho")))
//                .andExpect(jsonPath("isbn", equalTo("2198219")));
//    }
//
////    @Test
////    void deveriaAtualizarUmLivro() throws Exception {
////
////        mvc.perform(put("/livros/{id}", 1)
////                        .content(objectMapper.writeValueAsString())
////                        .contentType(MediaType.APPLICATION_JSON))
////                .andExpect(status().isOk())
////                .andExpect(content().json());
////
////
////    }
//
//    @Test
//    void deveriaDeletarUmLivro() throws Exception {
//        mvc.perform(delete("/livros/{id}", 1))
//                .andExpect(status().isNoContent());
//    }
//
//
//
//}
