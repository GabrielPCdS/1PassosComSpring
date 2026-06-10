package com.github.gabrielpcdsi.ProdutosApi.repository;

import com.github.gabrielpcdsi.ProdutosApi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
