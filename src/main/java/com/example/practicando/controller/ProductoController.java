package com.example.practicando.controller;


import com.example.practicando.model.Producto;
import com.example.practicando.services.impl.ProductoServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
@AllArgsConstructor
public class ProductoController {

    public final ProductoServiceImpl productoService;


    @GetMapping
    public List<Producto> findAll() {
        return productoService.getProductos();
    }

    @GetMapping("/{id}")
    public Producto findById(@PathVariable int id) {
        return productoService.getProducto(id);
    }

    @PostMapping
    public void create(@RequestBody Producto producto) {
        productoService.addProducto(producto);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody Producto producto) {
        productoService.updateProducto(producto, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        productoService.deleteProducto(id);
    }

}
