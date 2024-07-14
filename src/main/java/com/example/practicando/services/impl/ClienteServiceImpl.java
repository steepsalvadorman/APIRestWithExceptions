package com.example.practicando.services.impl;

import com.example.practicando.config.RestExceptionHandler;
import com.example.practicando.exceptions.BadRequestException;
import com.example.practicando.exceptions.ResourceNotFoundException;
import com.example.practicando.model.Cliente;
import com.example.practicando.repository.ClienteRepository;
import com.example.practicando.services.interfaces.ClienteInterface;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ClienteServiceImpl implements ClienteInterface {

    private final ClienteRepository clienteRepository;
    private final RestExceptionHandler restExceptionHandler;


    @Override
    public List<Cliente> getClientes() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente getCliente(int id) {
        return clienteRepository.findById((long)id).orElseThrow(()-> new ResourceNotFoundException("No existe el recurso que esta solicitando"));
    }

    @Override
    public void insertCliente(Cliente cliente) {
        Cliente cliente1 = clienteRepository.findById(cliente.getIdCliente()).orElseThrow(()-> new BadRequestException("El cliente ya existe"));
        if (cliente1 != null) {
            throw new BadRequestException("El cliente ya existe");
        } else {
            clienteRepository.save(cliente);
        }
    }

    @Override
    public void updateCliente(Cliente cliente, int id) {
        Cliente c = clienteRepository.findById((long) id).orElse(null);
        if (c != null) {
            clienteRepository.save(cliente);
        } else {
            System.out.println("Cliente no encontrado");
        }
    }

    @Override
    public void deleteCliente(int id) {
        Cliente c = clienteRepository.findById((long)id).orElse(null);
        if (c != null) {
            clienteRepository.delete(c);
        } else {
            System.out.println("Cliente no encontrado");
        }
    }
}
