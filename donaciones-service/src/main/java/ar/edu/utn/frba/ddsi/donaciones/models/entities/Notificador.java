package ar.edu.utn.frba.ddsi.donaciones.models.entities;

import lombok.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
//esta clase se crea para poner un metodo solo que es enviar
//el metodo no puede estar suelto, tiene que ir dentro de una clase
public class Notificador {

    public void enviar(String destino, String mensaje, MedioNotificacion medio) {
        System.out.println("Enviando " + medio + " a " + destino + ": " + mensaje);
    }
}