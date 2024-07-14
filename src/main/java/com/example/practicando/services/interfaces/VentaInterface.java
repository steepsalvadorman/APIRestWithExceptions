package com.example.practicando.services.interfaces;

import com.example.practicando.model.Venta;

import java.util.List;
import java.util.Optional;

public interface VentaInterface {
    List<Venta> getVentas();
    Venta findVentaById(int id);
    void insertVenta(Venta venta);
    void updateVenta(Venta venta, int id);
    void deleteVenta(int id);
}
