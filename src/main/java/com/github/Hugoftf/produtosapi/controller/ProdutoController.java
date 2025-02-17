package com.github.Hugoftf.produtosapi.controller;

import com.github.Hugoftf.produtosapi.model.Produtos;
import com.github.Hugoftf.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public Produtos obterPorId(@PathVariable("id") String id){
        return produtoRepository.findById(id).orElse(null);
    }
}
