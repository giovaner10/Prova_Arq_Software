package br.cesed.si.arquitetura.usuario;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carrinho")
public class CarrinhoController {

    @GetMapping
    public String getCarrinho(){
        return "esse eh o carrinho abella";
    };

}
