-- Datos para la tabla CLIENTE
INSERT IGNORE INTO casopDB1.cliente (id_cliente, nombre, apellido, nro_documento, email, create_at) VALUES
(1, 'Juan', 'Perez', '12345678', 'juan.perez@example.com', '2023-01-01'),
(2, 'Maria', 'Gonzalez', '87654321', 'maria.gonzalez@example.com', '2023-02-01'),
(3, 'Carlos', 'Ramirez', '12312312', 'carlos.ramirez@example.com', '2023-03-01'),
(4, 'Ana', 'Lopez', '32132132', 'ana.lopez@example.com', '2023-04-01'),
(5, 'Luis', 'Martinez', '45645645', 'luis.martinez@example.com', '2023-05-01'),
(6, 'Laura', 'Hernandez', '65465465', 'laura.hernandez@example.com', '2023-06-01'),
(7, 'Jose', 'Garcia', '78978978', 'jose.garcia@example.com', '2023-07-01'),
(8, 'Sofia', 'Torres', '98798798', 'sofia.torres@example.com', '2023-08-01'),
(9, 'Miguel', 'Flores', '11223344', 'miguel.flores@example.com', '2023-09-01'),
(10, 'Lucia', 'Rojas', '22334455', 'lucia.rojas@example.com', '2023-10-01'),
(11, 'Pedro', 'Diaz', '33445566', 'pedro.diaz@example.com', '2023-11-01'),
(12, 'Elena', 'Cruz', '44556677', 'elena.cruz@example.com', '2023-12-01'),
(13, 'Rafael', 'Morales', '55667788', 'rafael.morales@example.com', '2023-01-15'),
(14, 'Gabriela', 'Sanchez', '66778899', 'gabriela.sanchez@example.com', '2023-02-15'),
(15, 'Fernando', 'Reyes', '77889900', 'fernando.reyes@example.com', '2023-03-15');

-- Datos para la tabla PRODUCTO
INSERT IGNORE INTO casopDB1.producto (id_producto, descripcion, cantidad, estado) VALUES
(1, 'Producto A', 100, 1),
(2, 'Producto B', 200, 1),
(3, 'Producto C', 150, 1),
(4, 'Producto D', 120, 1),
(5, 'Producto E', 180, 1),
(6, 'Producto F', 110, 1),
(7, 'Producto G', 140, 1),
(8, 'Producto H', 130, 1),
(9, 'Producto I', 160, 1),
(10, 'Producto J', 170, 1),
(11, 'Producto K', 190, 1),
(12, 'Producto L', 80, 1),
(13, 'Producto M', 90, 1),
(14, 'Producto N', 210, 1),
(15, 'Producto O', 220, 1);

-- Datos para la tabla VENTA
INSERT IGNORE INTO casopDB1.venta (id_venta, fecha, serie, numero, total, id_cliente) VALUES
(1, '2024-01-01', 'A001', '0001', 1000.0, 1),
(2, '2024-01-02', 'A001', '0002', 1500.0, 2),
(3, '2024-01-03', 'A001', '0003', 1200.0, 3),
(4, '2024-01-04', 'A001', '0004', 1300.0, 4),
(5, '2024-01-05', 'A001', '0005', 1100.0, 5),
(6, '2024-01-06', 'A001', '0006', 1400.0, 6),
(7, '2024-01-07', 'A001', '0007', 1150.0, 7),
(8, '2024-01-08', 'A001', '0008', 1250.0, 8),
(9, '2024-01-09', 'A001', '0009', 1350.0, 9),
(10, '2024-01-10', 'A001', '0010', 1050.0, 10),
(11, '2024-01-11', 'A001', '0011', 1450.0, 11),
(12, '2024-01-12', 'A001', '0012', 1550.0, 12),
(13, '2024-01-13', 'A001', '0013', 1650.0, 13),
(14, '2024-01-14', 'A001', '0014', 1750.0, 14),
(15, '2024-01-15', 'A001', '0015', 1850.0, 15);

-- Datos para la tabla DETALLE_VENTA
INSERT IGNORE INTO casopDB1.detalle_venta (id_detalle, cantidad, precio, sub_total, id_venta, id_producto) VALUES
(1, 10, 100.0, 1000.0, 1, 1),
(2, 15, 100.0, 1500.0, 2, 2),
(3, 12, 100.0, 1200.0, 3, 3),
(4, 13, 100.0, 1300.0, 4, 4),
(5, 11, 100.0, 1100.0, 5, 5),
(6, 14, 100.0, 1400.0, 6, 6),
(7, 11.5, 100.0, 1150.0, 7, 7),
(8, 12.5, 100.0, 1250.0, 8, 8),
(9, 13.5, 100.0, 1350.0, 9, 9),
(10, 10.5, 100.0, 1050.0, 10, 10),
(11, 14.5, 100.0, 1450.0, 11, 11),
(12, 15.5, 100.0, 1550.0, 12, 12),
(13, 16.5, 100.0, 1650.0, 13, 13),
(14, 17.5, 100.0, 1750.0, 14, 14),
(15, 18.5, 100.0, 1850.0, 15, 15);
