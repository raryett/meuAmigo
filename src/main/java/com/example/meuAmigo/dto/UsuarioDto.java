package com.example.meuAmigo.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioDto {

    private Integer    idUsuario;
    private String     nomeCompleto;
    private String     email;
    private String     senha;

}
