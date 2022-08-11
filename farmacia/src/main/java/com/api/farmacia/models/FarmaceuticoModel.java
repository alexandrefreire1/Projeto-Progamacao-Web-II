package com.api.farmacia.models;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_FARMACEUTICO")
public class FarmaceuticoModel implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	private String cadastrar;
	private String pesquisar;
	private String atualizar;
	private String remover;
	private String vender;
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
