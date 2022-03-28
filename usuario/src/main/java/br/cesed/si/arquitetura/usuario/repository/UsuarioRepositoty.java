package br.cesed.si.arquitetura.usuario.repository;

import br.cesed.si.arquitetura.usuario.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositoty extends JpaRepository<UsuarioEntity, Long> {


}
