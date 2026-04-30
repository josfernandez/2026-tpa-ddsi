package ar.edu.utn.frba.ddsi.donaciones.services;
import ar.edu.utn.frba.ddsi.donaciones.models.entities.*;// importo todas las entities... es mas practico

import java.util.ArrayList;
import java.util.List;

public class ServicioAsignacion {

    public List<Asignacion> asignar(
            List<DonacionSegmentada> donaciones,
            List<Necesidad> necesidades
    ) {

        List<Asignacion> resultado = new ArrayList<>();

        for (Necesidad necesidad : necesidades) {

            double restante = necesidad.getCantidadObjetivo();

            for (DonacionSegmentada donacion : donaciones) {

                if (donacion.estaAsignada())
                    continue;

                if (!donacion.getSubcategoria().equals(necesidad.getSubcategoria()))
                    continue;

                if (donacion.getCantidadTotal() <= restante) {

                    Asignacion asignacion = Asignacion.builder()
                            .donacionSegmentada(donacion)
                            .necesidad(necesidad)
                            .build();

                    donacion.marcarComoAsignada(asignacion);

                    resultado.add(asignacion);

                    restante -= donacion.getCantidadTotal();
                }

                if (restante == 0)
                    break;
            }
        }

        return resultado;
    }
}