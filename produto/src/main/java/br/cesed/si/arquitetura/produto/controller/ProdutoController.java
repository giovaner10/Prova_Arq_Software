package br.cesed.si.arquitetura.produto.controller;

import br.cesed.si.arquitetura.produto.entity.ProdutoEntity;
import br.cesed.si.arquitetura.produto.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public ProdutoEntity save(@RequestBody ProdutoEntity produto){
        return service.save(produto);
    }


    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<ProdutoEntity> findAll(){
        return service.findAllProduto();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ProdutoEntity findByid(@PathVariable("id") Long id){
        return service.findByid(id);
    }


    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable("id") Long id){
        service.deleteByid(id);
    }


    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateProduto(@PathVariable("id") Long id, @RequestBody ProdutoEntity produto){
        service.update(id, produto);
    }

}
