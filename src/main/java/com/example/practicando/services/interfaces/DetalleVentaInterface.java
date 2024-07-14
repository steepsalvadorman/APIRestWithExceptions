package com.example.practicando.services.interfaces;

import com.example.practicando.model.DetalleVenta;

import java.util.List;
import java.util.Optional;

public interface DetalleVentaInterface {
    List<DetalleVenta> getDetalleVentas();
    DetalleVenta getDetalleVenta(int id);
    void addDetalleVenta(DetalleVenta detalleVenta);
    void updateDetalleVenta(DetalleVenta detalleVenta, int id);
    void deleteDetalleVenta(int id);

}
