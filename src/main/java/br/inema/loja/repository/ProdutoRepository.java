package br.inema.loja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.inema.loja.model.Produto;
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}