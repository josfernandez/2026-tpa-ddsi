package ar.edu.utn.frba.ddsi.donaciones.models.entities;

import lombok.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class DonanteJuridico extends Donante {
    private String razonSocial;
    private String tipo;
    private String rubro;
}
