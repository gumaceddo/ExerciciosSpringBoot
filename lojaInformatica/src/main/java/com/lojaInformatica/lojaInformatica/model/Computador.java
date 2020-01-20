package com.lojaInformatica.lojaInformatica.model;

public class Computador extends Produto{
	private String nome;
	private int id;
	private float valor;
	
	public Computador() {
		super();
	}
	
	public Computador(String nome, int id, float valor) {
		super();
		this.nome = nome;
		this.id = id;
		this.valor = valor;
	}
	
	
	public String getNome() {
		return nome;
	}
	public int getId() {
		return id;
	}
	public float getValor() {
		return valor;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	

}
