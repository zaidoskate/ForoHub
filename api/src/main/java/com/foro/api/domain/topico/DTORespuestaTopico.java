package com.foro.api.domain.topico;

import java.time.LocalDateTime;
import com.foro.api.domain.curso.Curso;
import com.foro.api.domain.usuario.Usuario;

public record DTORespuestaTopico(
        Long id,
        String titulo,
        String mensaje,
        LocalDateTime fechaCreacion,
        EstatusTopico estatus,
        Usuario usuario,
        Curso curso
) {
}
