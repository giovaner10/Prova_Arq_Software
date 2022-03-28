package br.cesed.si.arquitetura.usuario.service;


import br.cesed.si.arquitetura.usuario.entity.UsuarioEntity;
import br.cesed.si.arquitetura.usuario.repository.UsuarioRepositoty;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UsuarioService {

    private  UsuarioRepositoty usuarioRepositoty;

    public UsuarioEntity save(UsuarioEntity user){
        return usuarioRepositoty.save(user);
    }

    public List<UsuarioEntity> findAll(){
        return usuarioRepositoty.findAll();
    }

    public UsuarioEntity findByCPF(Long cpf){
        return usuarioRepositoty.getById(cpf);
    }

    public UsuarioEntity deleteByCPF(Long cpf){
        usuarioRepositoty.deleteById(cpf);
        return null;
    }




}
