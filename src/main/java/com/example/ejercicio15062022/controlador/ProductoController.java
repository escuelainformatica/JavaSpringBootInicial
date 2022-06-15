package com.example.ejercicio15062022.controlador;

import com.example.ejercicio15062022.modelo.Producto;
import com.example.ejercicio15062022.servicio.ProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pepe")
public class ProductoController {
    @Autowired
    ProductoServicio srv; //  ProductoServicio srv=new ProductoServicio();

    @GetMapping("/obtener") // http://localhost:8080/pepe/obtener
    public Producto obtener() {
        return srv.obtener();
    }
    @GetMapping("/leerTodos") // http://localhost:8080/pepe/leerTodos
    public List<Producto> leerTodos() {
        return srv.leerTodos();
    }

}
