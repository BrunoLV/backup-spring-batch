package com.valhala.catalogo.modelo;

import java.io.Serializable;

public class Revista implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String titulo;
	private String subTitulo;
	private String arco;
	private Short edicao;
	private Short anoPublicacao;
	private Double valor;

	public Revista() {
		// TODO Auto-generated constructor stub
	}

	public Revista(Long id, String titulo, String subTitulo, String arco,
			Short edicao, Short anoPublicacao, Double valor) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.subTitulo = subTitulo;
		this.arco = arco;
		this.edicao = edicao;
		this.anoPublicacao = anoPublicacao;
		this.valor = valor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSubTitulo() {
		return subTitulo;
	}

	public void setSubTitulo(String subTitulo) {
		this.subTitulo = subTitulo;
	}

	public String getArco() {
		return arco;
	}

	public void setArco(String arco) {
		this.arco = arco;
	}

	public Short getEdicao() {
		return edicao;
	}

	public void setEdicao(Short edicao) {
		this.edicao = edicao;
	}

	public Short getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(Short anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
}
