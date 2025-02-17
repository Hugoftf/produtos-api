package com.github.Hugoftf.produtosapi.repository;

import com.github.Hugoftf.produtosapi.model.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produtos, String> {
}
