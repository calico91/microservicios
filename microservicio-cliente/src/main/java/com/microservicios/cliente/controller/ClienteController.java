package com.microservicios.cliente.controller;

import com.microservicios.cliente.http.response.CreditosClienteResponse;
import com.microservicios.cliente.model.Cliente;
import com.microservicios.cliente.service.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/cliente")
@AllArgsConstructor
public class ClienteController {

    private final ClienteService clienteService;

    @PostMapping("registrar-cliente")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Cliente> registrarUsuario(@RequestBody Cliente cliente) {
        return ResponseEntity.ok().body(clienteService.registrarCliente(cliente));
    }

    @GetMapping("consultar-clientes")
    public ResponseEntity<List<Cliente>> consultarClientes() {
        return ResponseEntity.ok(clienteService.consultarClientes());
    }

    @GetMapping("consultar-cliente")
    public ResponseEntity<Cliente> consultarCliente(Integer idCliente) {
        return ResponseEntity.ok(clienteService.consultarCliente(idCliente));
    }

    @GetMapping("consultar-creditos-cliente/{idCliente}")
    public ResponseEntity<CreditosClienteResponse> consultarCreditosCliente(@PathVariable Integer idCliente) {
        return ResponseEntity.ok(clienteService.consultarCreditosCliente(idCliente));
    }

}
