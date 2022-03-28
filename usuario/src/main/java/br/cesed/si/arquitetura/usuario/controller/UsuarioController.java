package br.cesed.si.arquitetura.usuario.controller;

import br.cesed.si.arquitetura.usuario.entity.UsuarioEntity;
import br.cesed.si.arquitetura.usuario.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/usuario")
public class UsuarioController {

    private UsuarioService service;

    @PostMapping()
    public ResponseEntity<UsuarioEntity> save(UsuarioEntity usuario){
        return new ResponseEntity<>(service.save(usuario), HttpStatus.CREATED);
    }


    @GetMapping()
    public ResponseEntity<List<UsuarioEntity>> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }


    @GetMapping("/{cpf}")
    public ResponseEntity<UsuarioEntity> findByCPF(@PathVariable("cpf") Long cpf){
        return new ResponseEntity<>(service.findByCPF(cpf), HttpStatus.OK);
    }


    @DeleteMapping("/{cpf}")
    public UsuarioEntity deleteByCPF(@PathVariable("cpf") Long cpf){
        return service.deleteByCPF(cpf);
    }





}
