package ar.edu.utn.frba.ddsi.donaciones.models.entities;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class EntidadBeneficiaria {
    private String razonSocial;
    private Direccion direccion;
    private String telefono;
    private TipoEntidad entidades;
}
