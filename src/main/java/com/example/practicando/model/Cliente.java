package com.example.practicando.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;
    private String nombre;
    private String apellido;
    private String nroDocumento;
    private String email;
    private Date createAt;
}
