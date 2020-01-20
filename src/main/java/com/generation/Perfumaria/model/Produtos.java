package com.generation.Perfumaria.model;

public class Produtos {

		private int id;
		private String nome;
		private String modelo;
		
		public Produtos(int id, String nome, String modelo) {
			super();
			this.id = id;
			this.nome = nome;
			this.modelo = modelo;
		}
		
		public Produtos() {
			super();
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		
		
		
	}

