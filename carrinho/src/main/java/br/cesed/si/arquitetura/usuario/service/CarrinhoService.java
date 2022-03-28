package br.cesed.si.arquitetura.usuario.service;


import br.cesed.si.arquitetura.usuario.entity.CarrinhoEntity;
import br.cesed.si.arquitetura.usuario.repository.CarrinhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CarrinhoService {

    @Autowired
    private CarrinhoRepository carrinhoRepository;

    public CarrinhoEntity save(CarrinhoEntity user){
        return carrinhoRepository.save(user);
    }

    public List<CarrinhoEntity> findAllCarrinho(){
        return carrinhoRepository.findAll();
    }

    public CarrinhoEntity findByid(Long id){
        return (carrinhoRepository.findById(id)).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "carrinho nao encontrado."));
    }

    public void deleteByid(Long id){
        this.findByid(id);
        carrinhoRepository.deleteById(id);
    }

    public void update(Long id,  CarrinhoEntity carrinho){
        this.findByid(id);
        this.save(carrinho);
    }





}
