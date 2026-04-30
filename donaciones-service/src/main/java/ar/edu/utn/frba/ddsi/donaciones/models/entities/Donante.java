package ar.edu.utn.frba.ddsi.donaciones.models.entities;

public class Donante {
    private String nombre; // nombre o razonsocial
    private TipoDonante tipo; //humano o juridico
    private String identificador; //DNI O CUIT O CUIL
    private String representante; //solo se usa para razon social
    private Direccion direccion;
}
