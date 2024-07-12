package com.foro.api.domain.usuario;

public record DTOActualizarUsuario(
        Long id,
        String nombre,
        String email
) {
}
