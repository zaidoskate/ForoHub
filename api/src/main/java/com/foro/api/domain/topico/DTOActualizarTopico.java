package com.foro.api.domain.topico;

import com.foro.api.domain.curso.Curso;
import com.foro.api.domain.usuario.Usuario;

public record DTOActualizarTopico(
        Long id,
        String titulo,
        String mensaje,
        Usuario usuario,
        Curso curso
) {
}
