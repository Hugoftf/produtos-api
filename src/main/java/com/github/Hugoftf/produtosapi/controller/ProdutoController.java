package com.github.Hugoftf.produtosapi.controller;

import com.github.Hugoftf.produtosapi.model.Produtos;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @PostMapping
    public Produtos salvar(@RequestBody Produtos produtos){
        System.out.println("Produto recebido" + produtos);
        return produtos;
    }
}
