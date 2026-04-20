package ar.edu.utn.frba.ddsi.donaciones.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DonacionesController {

    @GetMapping("/saludo")
    public String saludo() {
        return "Hola desde el servicio de Donaciones.";
    }
}
