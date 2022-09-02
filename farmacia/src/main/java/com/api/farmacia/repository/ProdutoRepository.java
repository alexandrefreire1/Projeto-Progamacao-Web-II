package com.api.farmacia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.farmacia.produtos.models.Produto;

//Usei o JpaRepository, porque ele é bom para fazer persistência no bd.
//save, delete, já vem prontos.
public interface ProdutoRepository  extends JpaRepository<Produto, Long>{
	
	Produto findById(long id);
}
