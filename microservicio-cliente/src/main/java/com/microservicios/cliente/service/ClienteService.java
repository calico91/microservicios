package com.microservicios.cliente.service;

import com.microservicios.cliente.model.Cliente;

import java.util.List;

public interface ClienteService {

    Cliente registrarCliente(Cliente cliente);

    List<Cliente> consultarClientes();

    Cliente consultarCliente(Integer idCliente);
}
