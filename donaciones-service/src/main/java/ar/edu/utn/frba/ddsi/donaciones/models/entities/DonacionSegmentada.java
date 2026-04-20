package ar.edu.utn.frba.ddsi.donaciones.models.entities;

import lombok.*;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class DonacionSegmentada {
    private String subcategoria;
    private double cantidadTotal;
    private String fechaVencimiento;
    private EstadoProducto estadoProducto;  // NUEVO, USADO
    private EstadoDonacionSegmentada estado;//DEPOSITO,PARCIAL,TOTAL

    public double obtenerCantidadAsignada(){return 0;}
    public double obtenerCantidadDisponible(){return 0;}
    public void actualizarEstado(){}
}


