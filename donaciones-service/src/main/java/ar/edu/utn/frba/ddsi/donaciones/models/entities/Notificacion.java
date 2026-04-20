package ar.edu.utn.frba.ddsi.donaciones.models.entities;

import lombok.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Notificacion {
    private String mensaje;
    private MedioNotificacion medio;
    private EstadoNotificacion estado;

    public void enviar() {
        System.out.println("Enviando notificación...");
    }
}