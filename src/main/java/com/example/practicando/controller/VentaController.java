package com.example.practicando.controller;


import com.example.practicando.model.Venta;
import com.example.practicando.repository.VentaRepository;
import com.example.practicando.services.impl.VentaServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ventas")
@AllArgsConstructor
public class VentaController {
    private final VentaServiceImpl ventaService;


    @GetMapping
    public List<Venta> findAll() {
        return ventaService.getVentas();
    }

    @GetMapping("/{id}")
    public Venta findById(int id) {
        return ventaService.findVentaById(id);
    }

    @PostMapping
    public void save(@RequestBody Venta venta) {
        ventaService.insertVenta(venta);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody Venta venta, @PathVariable int id) {
        ventaService.updateVenta(venta, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        ventaService.deleteVenta(id);
    }



}
