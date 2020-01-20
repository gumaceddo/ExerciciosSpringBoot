package com.generation.Perfumaria.service;

public class ProdutosService {
	private int id;
	private String marca;
	private String nome;
	
	public ProdutosService(int id, String marca, String nome) {
		super();
		this.id = id;
		this.marca = marca;
		this.nome = nome;
	}
	public ProdutosService() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
