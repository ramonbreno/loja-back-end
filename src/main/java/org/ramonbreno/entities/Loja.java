package org.ramonbreno.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Loja {
	@Id
	@GeneratedValue
    private Integer id;
    private String produto;
    private String descricao;
    private Double preco;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Loja(String produto, String descricao, Double preco) {
		this.produto = produto;
		this.descricao = descricao;
		this.preco = preco;
	}
	@Override
	public String toString() {
		return "Loja [id=" + id + ", produto=" + produto + ", descricao=" + descricao + ", preco=" + preco +"]";
	}
	public Loja() {
	}
    
}
