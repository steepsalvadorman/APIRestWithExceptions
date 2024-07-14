package com.example.practicando.services.impl;

import com.example.practicando.exceptions.BadRequestException;
import com.example.practicando.exceptions.ResourceNotFoundException;
import com.example.practicando.model.Venta;
import com.example.practicando.repository.VentaRepository;
import com.example.practicando.services.interfaces.VentaInterface;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class VentaServiceImpl implements VentaInterface {

    private final VentaRepository ventaRepository;

    @Override
    public List<Venta> getVentas() {
        return ventaRepository.findAll();
    }

    @Override
    public Venta findVentaById(int id) {
        return ventaRepository.findById((long)id).orElseThrow(()-> new ResourceNotFoundException("No existe el recurso solicitado"));
    }

    @Override
    public void insertVenta(Venta venta) {
        Venta venta1 = ventaRepository.findById(venta.getIdVenta()).orElseThrow(()-> new ResourceNotFoundException("No existe el recurso solicitado"));
        if(venta1 != null) {
            throw new BadRequestException("El recurso ya existe en el sistema");
        } else {
            ventaRepository.save(venta);
        }
    }

    @Override
    public void updateVenta(Venta venta, int id) {
        Venta venta1 = ventaRepository.findById((long)id).orElse(null);
        if (venta1 != null) {
            ventaRepository.save(venta);
        } else {
            System.out.println("La venta no existe y no se puede actualizar");
        }
    }

    @Override
    public void deleteVenta(int id) {
        Venta venta = ventaRepository.findById((long)id).orElse(null);
        if (venta != null){
            ventaRepository.delete(venta);
        } else {
            System.out.println("No existe la venta que se desea eliminar");
        }
    }
}
