package com.example.practicando.services.impl;

import com.example.practicando.exceptions.ResourceNotFoundException;
import com.example.practicando.model.Producto;
import com.example.practicando.repository.ProductoRepository;
import com.example.practicando.exceptions.BadRequestException;
import com.example.practicando.services.interfaces.ProductoInterface;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductoServiceImpl implements ProductoInterface {

    private final ProductoRepository productoRepository;

    @Override
    public List<Producto> getProductos() {
        return productoRepository.findAll();
    }

    @Override
    public Producto getProducto(int id) {
        return productoRepository.findById((long)id).orElseThrow(()->new ResourceNotFoundException("El producto con ese ID no existe"));
    }

    @Override
    public void addProducto(Producto producto) {
        Producto producto1 = productoRepository.findById(Long.valueOf(producto.getIdProducto())).orElseThrow(() -> new ResourceNotFoundException("No existe el recurso solicitado"));
        if (producto1 != null) {
            throw new BadRequestException("El producto ya existe");
        } else {
            productoRepository.save(producto);
        }
    }

    @Override
    public void updateProducto(Producto producto, int id) {
        Producto producto1 = productoRepository.findById((long)id).orElse(null);
        if (producto1 != null) {
            productoRepository.save(producto1);
        } else {
            System.out.println("No se encontro el producto que se quiere actualizar");
        }
    }

    @Override
    public void deleteProducto(int id) {
        Producto producto = productoRepository.findById((long)id).orElse(null);
        if (producto != null) {
            productoRepository.delete(producto);
        }else {
            System.out.println("No se encontro el producto a eliminar");
        }



    }
}
