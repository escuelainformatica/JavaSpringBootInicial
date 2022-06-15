package com.example.ejercicio15062022.controlador;

import com.example.ejercicio15062022.modelo.Compra;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // indicando que la clase va a ser un controlador
@RequestMapping("/compra") // la ruta inicial donde se va a llamar el controlador http://localhost:8080/compra
public class CompraControlador {

    @GetMapping("/obtener") // http://localhost:8080/compra/obtener
    public Compra obtener() {
        Compra resultado=new Compra("cocacola",20,30);

        return resultado;
    }

}
