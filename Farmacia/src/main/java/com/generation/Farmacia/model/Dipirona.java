package com.generation.Farmacia.model;

public class Dipirona extends Produto{
	private String nome;
	private int id;
	private float valor;
	
	public Dipirona() {
		super();
	}

	public Dipirona(String nome, int id, float valor) {
		super();
		this.nome = nome;
		this.id = id;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	
}
