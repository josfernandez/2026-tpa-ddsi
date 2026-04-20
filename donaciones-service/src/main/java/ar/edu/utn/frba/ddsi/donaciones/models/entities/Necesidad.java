package ar.edu.utn.frba.ddsi.donaciones.models.entities;

import lombok.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Necesidad {

    private String subcategoria;
    private double cantidadObjetivo;
    private double cantidadActual;
    private TipoNecesidad tipo;
    private String descripcion;
    @Builder.Default
    private List<Asignacion> asignaciones = new ArrayList<>();

    public void registrarRecepcion(double cantidad) {
        this.cantidadActual += cantidad;
    }

    public boolean estaSatisfecha() {
        return this.cantidadActual >= this.cantidadObjetivo;
    }
}