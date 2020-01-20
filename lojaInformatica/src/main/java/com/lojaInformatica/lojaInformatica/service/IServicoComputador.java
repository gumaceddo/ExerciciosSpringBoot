package com.lojaInformatica.lojaInformatica.service;

import java.util.List;

import com.lojaInformatica.lojaInformatica.model.Computador;

public interface IServicoComputador {

	Computador insert(Computador computador);
	
	Computador update(Computador computador);
	
	void delete(int id);
	
	List<Computador> getAll();
	
	Computador getById(int id);
	
	
}
