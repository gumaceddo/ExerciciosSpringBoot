package com.generation.Farmacia.service;

import java.util.List;

import com.generation.Farmacia.model.Dipirona;


public interface IServiceDipirona {
	

	Dipirona insert(Dipirona dipirona);
	
	Dipirona update(Dipirona dipirona);
	
	void delete(int id);
	
	List<Dipirona> getAll();
	
	Dipirona getById(int id);
	
}
