package com.example.ejercicio15062022.servicio;

import com.example.ejercicio15062022.modelo.Producto;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoServicio {
    public Producto obtener() {
        Producto prod=new Producto("coc","cocacola",5555);
        return prod;
    }
    public List<Producto> leerTodos() {
        List<Producto> productos=new ArrayList<>();
        productos.add(new Producto("coc","cocacola",5555));
        productos.add(new Producto("fnt","fanta",444));
        return productos;
    }
}
