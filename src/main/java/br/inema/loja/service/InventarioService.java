package br.inema.loja.service;

import java.util.Optional;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Service;

import br.inema.loja.model.Inventario;
import br.inema.loja.model.Pedido;
import br.inema.loja.repository.InventarioRepository;

@Service
public class InventarioService {
	// Criar Repositorio
	private InventarioRepository inventarioRepository;

	// construtor
	public InventarioService(InventarioRepository inventarioRepository) {
		this.inventarioRepository = inventarioRepository;
	}
	// Verificar se tem a quantidade disponivel no bando de dados
	public Boolean verificarDisponibilidade(Long id, Long quantidade) {
		Optional<Inventario> inven = inventarioRepository.findById(id);
		if(inven.get().getQuantidade() >= quantidade) {
			return true;
		}
		return false;
	}

	// Atualizando quantidade
	public void atualizarQuantidade(Long id, Long quantidade) {
		Optional<Inventario> inven = inventarioRepository.findById(id);
		Long sobra = inven.get().getQuantidade() - quantidade;
		inven.get().setQuantidade(sobra);
		inventarioRepository.save(inven.get());
	}
}
