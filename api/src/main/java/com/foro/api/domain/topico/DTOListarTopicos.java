package com.foro.api.domain.topico;


import java.time.LocalDateTime;

public record DTOListarTopicos(
        Long id,
        String titulo,
        String mensaje,
        LocalDateTime fechaCreacion,
        String estatus,
        String usuario,
        String curso
) {
    public DTOListarTopicos(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getTitulo(), topico.getFechaCreacion(), topico.getEstatus().toString(), topico.getUsuario().getNombre(), topico.getCurso().getNombre());
    }
}
