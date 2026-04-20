package ar.edu.utn.frba.ddsi.donaciones.models.entities;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DonacionSegmentada {

    private String subcategoria;
    private double cantidadTotal;
    private String fechaVencimiento;
    private EstadoProducto estadoProducto;
    private EstadoDonacionSegmentada estado;

    @Builder.Default
    private List<Asignacion> asignaciones = new ArrayList<>();
    // no me cierra pero no se si hay otra forma
    // estoy creando una lista de asignacion para llevar el conteo de cuanto ya se asigno.
    // nose si la clase donacionsegmentada tiene que llevar esta cuenta

    public double obtenerCantidadAsignada() {
        return asignaciones.stream()
                .mapToDouble(Asignacion::getCantidadAsignada)
                .sum();
    }

    // 🔹 cuánto queda disponible
    public double obtenerCantidadDisponible() {
        return cantidadTotal - obtenerCantidadAsignada();
    }

    // 🔹 actualizar estado simple (opcional pero suma puntos)
    public void actualizarEstado() {
        if (obtenerCantidadAsignada() == 0) {
            this.estado = EstadoDonacionSegmentada.DEPOSITO;
        } else if (obtenerCantidadAsignada() < cantidadTotal) {
            this.estado = EstadoDonacionSegmentada.PARCIAL;
        } else {
            this.estado = EstadoDonacionSegmentada.TOTAL;
        }
    }
}


