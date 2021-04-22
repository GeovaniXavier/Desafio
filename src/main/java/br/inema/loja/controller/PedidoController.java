package br.inema.loja.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.inema.loja.model.Pedido;
import br.inema.loja.service.PedidoService;

@RestController
@RequestMapping(path = "/api/pedidos")
public class PedidoController {

	private PedidoService pedidoService;

	public PedidoController(PedidoService pedidoService) {
		this.pedidoService = pedidoService;
	}

	@PostMapping
	public Pedido cadastrar(@RequestBody Pedido pedido) {
		return pedidoService.cadastrar(pedido);
	}




}
