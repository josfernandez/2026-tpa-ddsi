package ar.edu.utn.frba.ddsi.donaciones.models.entities;

import lombok.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class DonanteHumano extends Donante {
    private String nombre;
    private String apellido;
    private String dni;
    private int edad;
    private String genero;
    private String direccion;
}