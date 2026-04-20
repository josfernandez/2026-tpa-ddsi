package ar.edu.utn.frba.ddsi.donaciones.models.entities;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Asignacion {

    private DonacionSegmentada donacionSegmentada;
    private Necesidad necesidad;
    private double cantidadAsignada;
}