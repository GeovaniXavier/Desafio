package br.inema.loja.repository;
import br.inema.loja.model.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventarioRepository extends JpaRepository<Inventario, Long>{

}
