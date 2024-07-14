package com.example.practicando.services.interfaces;

import com.example.practicando.model.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoInterface {
    List<Producto> getProductos();
    Producto getProducto(int id);
    void addProducto(Producto producto);
    void updateProducto(Producto producto, int id);
    void deleteProducto(int id);
}
