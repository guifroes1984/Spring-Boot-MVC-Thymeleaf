package br.com.guifroes1984.clientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.guifroes1984.clientes.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    
}
