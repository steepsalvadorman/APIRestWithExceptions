package com.example.practicando.services.interfaces;

import com.example.practicando.model.Cliente;

import java.util.List;

public interface ClienteInterface {

    List<Cliente> getClientes();
    Cliente getCliente(int id);
    void insertCliente(Cliente cliente);
    void updateCliente(Cliente cliente, int id);
    void deleteCliente(int id);

}
