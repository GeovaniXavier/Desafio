package br.inema.loja.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.inema.loja.model.Cliente;
import br.inema.loja.repository.ClienteRepository;

@RestController
@RequestMapping(path = "/api")
public class ClienteController {


	private ClienteRepository clienteRepository;


	public ClienteController(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	@GetMapping
	public List<Cliente> listAll() {
		return clienteRepository.findAll();
	}

	@PostMapping
	public Cliente save(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
}
