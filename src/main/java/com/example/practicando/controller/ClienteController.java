package com.example.practicando.controller;


import com.example.practicando.config.RestExceptionHandler;
import com.example.practicando.exceptions.ResourceNotFoundException;
import com.example.practicando.model.Cliente;
import com.example.practicando.services.impl.ClienteServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
@AllArgsConstructor
public class ClienteController {

    private final ClienteServiceImpl clienteServiceimpl;


    @GetMapping
    public List<Cliente> listar() {
        return clienteServiceimpl.getClientes();
    }

    @GetMapping("/{id}")
    public Cliente buscar(@PathVariable int id) {
        return clienteServiceimpl.getCliente(id);
    }

    @PostMapping
    public void adicionar(@RequestBody Cliente cliente) {
        clienteServiceimpl.insertCliente(cliente);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable int id, @RequestBody Cliente cliente) {
        clienteServiceimpl.updateCliente(cliente, id);
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable int id) {
        clienteServiceimpl.deleteCliente(id);
    }

}
