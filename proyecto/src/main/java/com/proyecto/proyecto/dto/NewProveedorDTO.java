package com.proyecto.proyecto.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class NewProveedorDTO {
    private String nombre;
    private Integer telefono;
    private String direccion;
    private String tipo;     
}