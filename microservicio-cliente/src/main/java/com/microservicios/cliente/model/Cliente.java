package com.microservicios.cliente.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = ("id_cliente"))
    private Integer id;
    @Column(nullable = false, length = 50)
    private String nombres;
    @Column(nullable = false, length = 50)
    private String apellidos;
    @Column(length = 80)
    private String email;
    @Column(nullable = false, length = 20)
    private String celular;

}