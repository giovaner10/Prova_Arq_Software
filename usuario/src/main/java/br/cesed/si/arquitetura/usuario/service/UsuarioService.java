package br.cesed.si.arquitetura.usuario.service;


import br.cesed.si.arquitetura.usuario.entity.UsuarioEntity;
import br.cesed.si.arquitetura.usuario.repository.UsuarioRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private  UsuarioRepositoty usuarioRepositoty;

    public UsuarioEntity save(UsuarioEntity user){
        return usuarioRepositoty.save(user);
    }

    public List<UsuarioEntity> findAll(){
        return usuarioRepositoty.findAll();
    }

    public Optional<UsuarioEntity> findByCPF(Long cpf){
        return Optional.of(usuarioRepositoty.findByCpf(cpf)).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuario nao encontrado."));
    }

    public void deleteByCpf(Long cpf){
         usuarioRepositoty.deleteById(cpf);
    }




}


