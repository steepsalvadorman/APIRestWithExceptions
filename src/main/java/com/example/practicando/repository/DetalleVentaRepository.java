package com.example.practicando.repository;

import com.example.practicando.model.DetalleVenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DetalleVentaRepository extends JpaRepository<DetalleVenta, Long> {
}
