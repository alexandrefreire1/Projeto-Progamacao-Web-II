package com.api.farmacia.dtos;

import java.math.BigDecimal;

import javax.validation.constraints.NotBlank;

public class ProdutoDto {

	@NotBlank
	private String nome;
	@NotBlank
	private String descricao;
	@NotBlank
	private BigDecimal quantidade;
	@NotBlank
	private BigDecimal valor;
	@NotBlank
	private String tipo;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public BigDecimal getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
