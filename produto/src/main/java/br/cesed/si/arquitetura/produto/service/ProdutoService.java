package br.cesed.si.arquitetura.produto.service;

import br.cesed.si.arquitetura.produto.entity.ProdutoEntity;
import br.cesed.si.arquitetura.produto.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProdutoService {


    @Autowired
    private ProdutoRepository produtoRepository;

    public ProdutoEntity save(ProdutoEntity produto){
        return produtoRepository.save(produto);
    }

    public List<ProdutoEntity> findAllProduto(){
        return produtoRepository.findAll();
    }

    public ProdutoEntity findByid(Long id){
        return (produtoRepository.findById(id)).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "Produto nao encontrado."));
    }

    public void deleteByid(Long id){
        this.findByid(id);
        produtoRepository.deleteById(id);
    }

    public void update(Long id,  ProdutoEntity produto){
        this.findByid(id);
        this.save(produto);
    }

}
