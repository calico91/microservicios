package com.microservicios.credito.service;

import com.microservicios.credito.model.Credito;
import com.microservicios.credito.repository.CreditoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CreditoServiceImpl implements CreditoService {

    private final CreditoRepository creditoRepository;

    @Override
    public Credito registrarCredito(Credito credito) {
        return creditoRepository.save(credito);
    }

    @Override
    public List<Credito> consultarCreditos() {
        return creditoRepository.findAll();
    }

    @Override
    public Credito consultarCredito(Integer idCredito) {
        return creditoRepository.findById(idCredito).orElseThrow();
    }

    @Override
    public List<Credito> consultarCreditosCliente(Integer idCliente) {
        return creditoRepository.findByIdCliente(idCliente);
    }
}
