package ar.edu.utn.frba.ddsi.donaciones.models.entities;

import lombok.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder //se usa para crear y leer objetos... podria no ir en este caso

public abstract class Donante {
    private String email;
    private String telefono;
    private MedioNotificacion medioPreferido;
}
