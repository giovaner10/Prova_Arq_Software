package br.cesed.si.arquitetura.usuario.service;


import br.cesed.si.arquitetura.usuario.entity.UsuarioEntity;
import br.cesed.si.arquitetura.usuario.repository.UsuarioRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

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

    public UsuarioEntity findByCPF(Long cpf){
        return (usuarioRepositoty.findByCpf(cpf)).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuario nao encontrado."));
    }

    public void deleteByCpf(Long cpf){
        this.findByCPF(cpf);
         usuarioRepositoty.deleteById(cpf);
    }

    public void update(Long cpf,  UsuarioEntity usuario){
        this.findByCPF(cpf);
        this.save(usuario);
    }

}


