package com.microservicios.cliente.clientFeing;

import com.microservicios.cliente.dto.CreditoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "microservicio-credito", url = "localhost:8080/api/credito")
public interface CreditoFeingClient {

    @GetMapping("consultar-creditos-cliente/{idCliente}")
    List<CreditoDTO> consultarCreditosCliente(@PathVariable Integer idCliente);

}
