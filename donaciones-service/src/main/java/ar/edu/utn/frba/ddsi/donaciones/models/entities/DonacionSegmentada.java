package ar.edu.utn.frba.ddsi.donaciones.models.entities;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DonacionSegmentada {

    private Subcategoria subcategoria;
    private double cantidadTotal;
    private String fechaVencimiento;
    private EstadoProducto estadoProducto;

    @Builder.Default
    private EstadoDonacionSegmentada estado = EstadoDonacionSegmentada.DEPOSITO;

    private Asignacion asignacion;

    public void marcarComoAsignada(Asignacion asignacion) {
        if (this.asignacion != null) {
            throw new IllegalStateException("La donación ya fue asignada");
        }

        this.asignacion = asignacion;
        this.estado = EstadoDonacionSegmentada.TOTAL;
    }

    public boolean estaAsignada() {
        return this.asignacion != null;
    }
}


