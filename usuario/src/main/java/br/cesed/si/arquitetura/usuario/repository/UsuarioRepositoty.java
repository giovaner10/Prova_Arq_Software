package br.cesed.si.arquitetura.usuario.repository;

import br.cesed.si.arquitetura.usuario.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepositoty extends JpaRepository<UsuarioEntity, Long> {

    Optional<UsuarioEntity> findByCpf(Long cpf);
    //Void deleteByCpf(Long cpf);



}
