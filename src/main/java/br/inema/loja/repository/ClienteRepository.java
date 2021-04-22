package br.inema.loja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.inema.loja.model.Cliente;
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	
	
}
