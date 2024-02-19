package com.microservicios.cliente.service;

import com.microservicios.cliente.model.Cliente;
import com.microservicios.cliente.repository.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;

    @Override
    public Cliente registrarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> consultarClientes() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente consultarCliente(Integer idCliente) {
        return clienteRepository.findById(idCliente).orElseThrow();
    }
}
