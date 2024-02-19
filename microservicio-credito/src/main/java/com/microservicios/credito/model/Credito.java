package com.microservicios.credito.model;

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
public class Credito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = ("id_credito"))
    private Integer id;
    @Column(nullable = false, length = 50)
    private String estadoCredito;
    @Column(nullable = false, length = 10)
    private Integer idCliente;
    @Column(length = 80)
    private Double valorCredito;

}
