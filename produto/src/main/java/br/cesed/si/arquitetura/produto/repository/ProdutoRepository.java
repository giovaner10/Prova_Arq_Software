package br.cesed.si.arquitetura.produto.repository;

import br.cesed.si.arquitetura.produto.entity.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Long> {
}
