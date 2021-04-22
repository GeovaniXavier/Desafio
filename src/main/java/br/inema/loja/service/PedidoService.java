package br.inema.loja.service;

import javax.management.RuntimeErrorException;

import org.springframework.stereotype.Service;

import br.inema.loja.model.Pedido;
import br.inema.loja.model.Produto;
import br.inema.loja.repository.PedidoRepository;

@Service
public class PedidoService {

	private PedidoRepository pedidoRepository;

	private InventarioService inventarioService;

	public PedidoService(InventarioService inventarioService, PedidoRepository pedidoRepository) {
		this.inventarioService = inventarioService;
		this.pedidoRepository = pedidoRepository;
	}

	public Pedido cadastrar(Pedido pedido) {

		for (Produto produto : pedido.getProdutos()) {
			boolean temEmEstoque = inventarioService.verificarDisponibilidade(produto.getId(), produto.getQuantidade());	

			if (!temEmEstoque) {
				throw new RuntimeException("Não tem estoque para o produto de id " + produto.getId());				
			} 	
		}

		pedido = pedidoRepository.save(pedido); 

		for (Produto produto : pedido.getProdutos()) {
			inventarioService.atualizarQuantidade(produto.getId(), produto.getQuantidade());
		}

		return pedido;
	}

}
