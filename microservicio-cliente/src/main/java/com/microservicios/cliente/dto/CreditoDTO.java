package com.microservicios.cliente.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreditoDTO {

    private Integer id;
    private String estadoCredito;
    private Double valorCredito;
}
