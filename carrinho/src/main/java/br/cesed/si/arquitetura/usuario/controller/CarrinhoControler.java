package br.cesed.si.arquitetura.usuario.controller;

import br.cesed.si.arquitetura.usuario.entity.CarrinhoEntity;
import br.cesed.si.arquitetura.usuario.service.CarrinhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carrinho")
public class CarrinhoControler {

    @Autowired
    private CarrinhoService service;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public CarrinhoEntity save(@RequestBody CarrinhoEntity carrinho){
        return service.save(carrinho);
    }


    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<CarrinhoEntity> findAll(){
        return service.findAllCarrinho();
    }


    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public CarrinhoEntity findByid(@PathVariable("id") Long id){
        return service.findByid(id);
    }


    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable("id") Long id){
        service.deleteByid(id);
    }


    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCarrinho(@PathVariable("id") Long id, @RequestBody CarrinhoEntity usuarioEntity){
        service.update(id, usuarioEntity);
    }







}


