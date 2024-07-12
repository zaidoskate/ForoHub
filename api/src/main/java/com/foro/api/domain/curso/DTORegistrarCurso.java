package com.foro.api.domain.curso;

import jakarta.validation.constraints.NotBlank;

public record DTORegistrarCurso(
        @NotBlank
        String nombre,
        @NotBlank
        String categoria
) {
}
