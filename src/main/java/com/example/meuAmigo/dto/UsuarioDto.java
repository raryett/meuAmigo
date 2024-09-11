package com.example.meuAmigo.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDto {

    private int        idUsuario;
    private String     nomeCompleto;
    private String     email;
    private String     senha;

}
