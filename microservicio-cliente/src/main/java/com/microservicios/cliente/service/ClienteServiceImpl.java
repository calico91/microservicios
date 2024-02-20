package com.microservicios.cliente.service;

import com.microservicios.cliente.client.CreditoFeingClient;
import com.microservicios.cliente.dto.CreditoDTO;
import com.microservicios.cliente.http.response.CreditosClienteResponse;
import com.microservicios.cliente.model.Cliente;
import com.microservicios.cliente.repository.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;
    private final CreditoFeingClient creditoFeingClient;

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

    @Override
    public CreditosClienteResponse consultarCreditosCliente(Integer idCliente) {

        Cliente cliente = clienteRepository.findById(idCliente).orElse(new Cliente());

        return CreditosClienteResponse.builder()
                .nombreCliente(cliente.getNombres())
                .creditos(creditoFeingClient.consultarCreditosCliente(idCliente))
                .build();


    }
}
