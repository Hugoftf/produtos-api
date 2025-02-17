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

    @DeleteMapping("/{id}")
    public void deletePorId(@PathVariable("id") String id){
        produtoRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public void atualizarPorId(@PathVariable("id") String id,
                               @RequestBody Produtos produto){
      produto.setId(id);
      produtoRepository.save(produto);

    }
}
