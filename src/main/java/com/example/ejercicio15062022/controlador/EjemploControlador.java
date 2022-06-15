package com.example.ejercicio15062022.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controlador") // http://localhost:8080/controlador
public class EjemploControlador {

    @GetMapping("/ejemplo") // http://localhost:8080/controlador/ejemplo
    public String ejemplo() {
        return "hola mundo";
    }

}
