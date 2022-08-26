package com.api.farmacia.resources;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.farmacia.repository.ProdutoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import com.api.farmacia.produtos.models.Produto;

//permite que recursos restritos seja recuperados por outros domínios.
@CrossOrigin(origins="*")
//Essa é a classe que vai receber as requisições http 
@RestController

//Criando um URI padrão
@RequestMapping(value = "/api")

@Api(value = "Farmácia API Rest")
//liberando todos os domínios da API
public class ProdutoResource {
	
	@Autowired
	ProdutoRepository produtoRepository;
	
	@GetMapping("/produtos")
	@ApiOperation(value = "retorna uma lista de produtos farmaceuticos")
	public List<Produto> listaProdutos(){
		return produtoRepository.findAll();
	}
	
	@GetMapping("/produto/{id}")
	@ApiOperation(value = "Retorna um produto específico a partir do Id")
	public Produto listaProdutoUnico(@PathVariable(value = "id") long id){
		return produtoRepository.findById(id);
	}
	
	@PostMapping("/produto")
	@ApiOperation(value = "Cria novos produtos farmaceuticos")
	public Produto salvaProduto(@RequestBody @Valid Produto produto) {
		return produtoRepository.save(produto);
	}
	
	@DeleteMapping("/produto")
	@ApiOperation(value ="Deleta Produtos Farcameuticos a partir do Id")
	public void deletaProduto(@RequestBody Produto produto) {
		produtoRepository.delete(produto);
	}
	
	@PutMapping("/produto")
	@ApiOperation(value = "Atualiza Produto Farmaceutico a partir do Id")
	public Produto atualizaProduto(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}
}
