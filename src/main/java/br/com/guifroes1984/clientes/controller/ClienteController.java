package br.com.guifroes1984.clientes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import br.com.guifroes1984.clientes.model.Cliente;
import br.com.guifroes1984.clientes.repository.ClienteRepository;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;
    
    @GetMapping
    public ModelAndView listar() {
        ModelAndView modelView = new ModelAndView("cliente/listar.html");

        List<Cliente> clientes = clienteRepository.findAll();
        modelView.addObject("clientes", clientes);

        return modelView;
    }
}
