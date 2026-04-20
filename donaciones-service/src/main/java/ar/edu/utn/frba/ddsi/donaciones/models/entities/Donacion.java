package ar.edu.utn.frba.ddsi.donaciones.models.entities;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Donacion {

    private String descripcion;
    private String fecha;
    @Builder.Default
    private List<ItemDonacion> items = new ArrayList<>();
    @Builder.Default
    private List<DonacionSegmentada> segmentadas = new ArrayList<>();

    public void segmentar() {

        //  limpiar segmentadas
        this.segmentadas.clear();

        //  agrupar donaciones por tipo.
        Map<String, List<ItemDonacion>> grupos = items.stream()
                .collect(Collectors.groupingBy(item ->
                        item.getSubcategoria() + "|" +
                        item.getFechaVencimiento() + "|" +
                        item.getEstado()
                ));
        //  recorrer grupos
        for (List<ItemDonacion> grupo : grupos.values()) {

            ItemDonacion base = grupo.get(0);

            double cantidadTotal = grupo.stream()
                    .mapToDouble(ItemDonacion::getCantidad)
                    .sum();

            DonacionSegmentada segmentada = DonacionSegmentada.builder()
                    .subcategoria(base.getSubcategoria())
                    .fechaVencimiento(base.getFechaVencimiento())
                    .estadoProducto(base.getEstado())
                    .cantidadTotal(cantidadTotal)
                    .build();

            segmentadas.add(segmentada);
        }
    }
    public void asignar() { //no va asignar aca, pero bueno en algun lado tenia que ponerlo
        //falta una entidad o algo en el medio que se encargue de asignar hacer mas adelante// }
    }

}