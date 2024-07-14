package com.example.practicando.services.impl;

import com.example.practicando.exceptions.BadRequestException;
import com.example.practicando.exceptions.ResourceNotFoundException;
import com.example.practicando.model.DetalleVenta;
import com.example.practicando.repository.DetalleVentaRepository;
import com.example.practicando.services.interfaces.DetalleVentaInterface;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DetalleVentaServiceImpl implements DetalleVentaInterface {

    private final DetalleVentaRepository detalleVentaRepository;

    @Override
    public List<DetalleVenta> getDetalleVentas() {
        return detalleVentaRepository.findAll();
    }

    @Override
    public DetalleVenta getDetalleVenta(int id) {
        return detalleVentaRepository.findById((long)id).orElseThrow(()-> new ResourceNotFoundException("El detalle no existe"));
    }

    @Override
    public void addDetalleVenta(DetalleVenta detalleVenta) {
        DetalleVenta detalleVenta1 = detalleVentaRepository.findById(detalleVenta.getIdDetalle()).orElseThrow(() -> new ResourceNotFoundException("No existe el recurso solicitado"));
        if (detalleVenta1 != null) {
            throw new BadRequestException("El cliente ya existe");
        } else {
            detalleVentaRepository.save(detalleVenta);
        }
    }

    @Override
    public void updateDetalleVenta(DetalleVenta detalleVenta, int id) {
        DetalleVenta detalleVenta1 = detalleVentaRepository.findById((long)id).orElse(null);
        if (detalleVenta1 != null) {
            detalleVentaRepository.save(detalleVenta);
        } else {
            System.out.println("Error: Detalle Venta no encontrado para su actualizacion");
        }
    }

    @Override
    public void deleteDetalleVenta(int id) {
        DetalleVenta detalleVenta = detalleVentaRepository.findById((long)id).orElse(null);
       if (detalleVenta != null) {
           detalleVentaRepository.delete(detalleVenta);
       } else {
           System.out.println("Error: Detalle Venta no encontrada para borrarse");
       }
    }
}
