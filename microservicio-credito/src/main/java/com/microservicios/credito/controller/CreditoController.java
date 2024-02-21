package com.microservicios.credito.controller;

import com.microservicios.credito.model.Credito;
import com.microservicios.credito.service.CreditoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/credito")
@AllArgsConstructor
public class CreditoController {

    private final CreditoService creditoService;

    @PostMapping("/registrar-credito")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Credito> registrarCredito(@RequestBody Credito credito) {
        return ResponseEntity.ok().body(creditoService.registrarCredito(credito));
    }

    @GetMapping("/consultar-credito")
    public ResponseEntity<List<Credito>> consultarCreditos() {
        return ResponseEntity.ok(creditoService.consultarCreditos());
    }

    @GetMapping("/consultar-credito/{idCredito}")
    public ResponseEntity<Credito> consultarCredito(@PathVariable Integer idCredito) {
        return ResponseEntity.ok(creditoService.consultarCredito(idCredito));
    }

    @GetMapping("/consultar-creditos-cliente/{idCliente}")
    public ResponseEntity<List<Credito>> consultarCreditosCliente(@PathVariable Integer idCliente) {
        return ResponseEntity.ok(creditoService.consultarCreditosCliente(idCliente));
    }

}
