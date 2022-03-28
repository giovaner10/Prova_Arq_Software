package br.cesed.si.arquitetura.usuario.repository;

import br.cesed.si.arquitetura.usuario.entity.CarrinhoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarrinhoRepository extends JpaRepository<CarrinhoEntity, Long> {
}
