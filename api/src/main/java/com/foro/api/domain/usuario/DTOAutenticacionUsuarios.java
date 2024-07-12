package com.foro.api.domain.usuario;

public record DTOAutenticacionUsuarios(
        String nombre,
        String email,
        String contrasena
) {
}
