package com.foro.api.domain.topico;

import com.foro.api.domain.curso.Curso;
import com.foro.api.domain.usuario.Usuario;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DTORegistrarTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotNull @Valid
        Usuario usuario,
        @NotNull @Valid
        Curso curso
) {
}
