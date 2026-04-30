package ar.edu.utn.frba.ddsi.donaciones.models.entities;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemDonacion {

    private Subcategoria subcategoria;
    private Double cantidad;
    private String fechaVencimiento;
    private EstadoProducto estado; // nuevo/usado tiene que ser de tipo EstadoProducto ENUM ES UN TIPO
}