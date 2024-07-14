package com.example.practicando.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class DetalleVenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetalle;
    private Integer cantidad;
    private Double precio;
    private Double subTotal;

    @ManyToOne
    @JoinColumn(name = "idVenta")
    @JsonBackReference
    private Venta venta;

    @ManyToOne
    @JoinColumn(name = "idProducto")
    private Producto producto;
}
