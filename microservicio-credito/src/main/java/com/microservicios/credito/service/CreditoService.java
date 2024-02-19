package com.microservicios.credito.service;


import com.microservicios.credito.model.Credito;

import java.util.List;

public interface CreditoService {
    Credito registrarCredito(Credito credito);

    List<Credito> consultarCreditos();

    Credito consultarCredito(Integer idCredito);

    List<Credito> consultarCreditosCliente (Integer idCliente);
}
