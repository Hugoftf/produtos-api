package com.github.Hugoftf.produtosapi.controller;

import com.github.Hugoftf.produtosapi.model.Produtos;
import com.github.Hugoftf.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    public Produtos salvar(@RequestBody Produtos produtos){

        var id = UUID.randomUUID().toString();
        produtos.setId(id);

        produtoRepository.save(produtos);
        return produtos;
    }
}
