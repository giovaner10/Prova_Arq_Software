package br.cesed.si.arquitetura.usuario.controller;

import br.cesed.si.arquitetura.usuario.entity.UsuarioEntity;
import br.cesed.si.arquitetura.usuario.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioEntity save(@RequestBody UsuarioEntity usuario){
        return service.save(usuario);
    }


    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<UsuarioEntity> findAll(){
        return service.findAll();
    }


    @GetMapping("/{cpf}")
    @ResponseStatus(HttpStatus.OK)
    public UsuarioEntity findByCPF(@PathVariable("cpf") Long cpf){
        return service.findByCPF(cpf);
    }


    @DeleteMapping("/{cpf}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteByCpf(@PathVariable("cpf") Long cpf){
       service.deleteByCpf(cpf);
    }


    @PutMapping("/{cpf}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void atualizarCliente(@PathVariable("cpf") Long cpf, @RequestBody UsuarioEntity usuarioEntity){
        service.update(cpf, usuarioEntity);
    }







}
