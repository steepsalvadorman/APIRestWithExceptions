package com.example.practicando.controller;


import com.example.practicando.model.DetalleVenta;
import com.example.practicando.services.impl.DetalleVentaServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/detalle-venta")
@AllArgsConstructor
public class DetalleVentaController {

    private final DetalleVentaServiceImpl detalleVentaService;

    @GetMapping
    public List<DetalleVenta> getDetalleVenta() {
        return detalleVentaService.getDetalleVentas();
    }

    @GetMapping("/{id}")
    public DetalleVenta getDetalleVentaById(@PathVariable int id) {
        return  detalleVentaService.getDetalleVenta(id);
    }

    @PostMapping
    public void addDetalleVenta(@RequestBody DetalleVenta detalleVenta) {
        detalleVentaService.addDetalleVenta(detalleVenta);
    }

    @PutMapping("/{id}")
    public void updateDetalleVenta(@PathVariable int id, @RequestBody DetalleVenta detalleVenta) {
        detalleVentaService.updateDetalleVenta(detalleVenta,id);
    }

    @DeleteMapping("/{id}")
    public void deleteDetalleVenta(@PathVariable int id) {
       detalleVentaService.deleteDetalleVenta(id);
    }


}
