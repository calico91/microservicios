package com.microservicios.cliente.http.response;

import com.microservicios.cliente.dto.CreditoDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreditosClienteResponse {

    private String nombreCliente;
    private List<CreditoDTO> creditos;
}
