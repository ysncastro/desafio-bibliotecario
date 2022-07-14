package com.yasmin.biblioteca.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
@Builder(toBuilder = true)
public class LivroPageDto {

    private List<LivroDto> livroDtoList;

}
