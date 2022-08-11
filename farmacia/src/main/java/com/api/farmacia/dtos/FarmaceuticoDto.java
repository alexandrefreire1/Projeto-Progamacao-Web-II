package com.api.farmacia.dtos;

import javax.validation.constraints.NotBlank;

public class FarmaceuticoDto {
	
	@NotBlank
	private String cadastrar;
	@NotBlank
	private String pesquisar;
	@NotBlank
	private String atualizar;
	@NotBlank
	private String remover;
	@NotBlank
	private String vender;
	
	public String getCadastrar() {
		return cadastrar;
	}
	public void setCadastrar(String cadastrar) {
		this.cadastrar = cadastrar;
	}
	public String getPesquisar() {
		return pesquisar;
	}
	public void setPesquisar(String pesquisar) {
		this.pesquisar = pesquisar;
	}
	public String getAtualizar() {
		return atualizar;
	}
	public void setAtualizar(String atualizar) {
		this.atualizar = atualizar;
	}
	public String getRemover() {
		return remover;
	}
	public void setRemover(String remover) {
		this.remover = remover;
	}
	public String getVender() {
		return vender;
	}
	public void setVender(String vender) {
		this.vender = vender;
	}
}
