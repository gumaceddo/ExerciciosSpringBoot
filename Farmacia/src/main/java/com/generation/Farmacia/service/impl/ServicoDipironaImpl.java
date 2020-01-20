package com.generation.Farmacia.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.generation.Farmacia.model.Dipirona;
import com.generation.Farmacia.service.IServiceDipirona;

public class ServicoDipironaImpl implements IServiceDipirona{
	static List<Dipirona> listDip = new ArrayList<Dipirona>();
	private static int incr = 0;
	
	
	@Override
	public Dipirona insert(Dipirona dipirona) {
		incr++;
		dipirona.setId(incr);
		listDip.add(dipirona);
		
		return dipirona;
	}

	@Override
	public Dipirona update(Dipirona dipirona) {
		Dipirona aux = getById(dipirona.getId());
		if(aux != null) {
			aux.setNome(dipirona.getNome());
			aux.setValor(dipirona.getValor());
		}
		return aux;
	}

	@Override
	public void delete(int id) {
		int posicao = -1;
		for(int i = 0; i <this.listDip.size();i++) {
			if(this.listDip.get(i).getId()==id) {
				posicao = i;
				break;
			}
		}
		if(posicao >= 0) {
			this.listDip.remove(posicao);
		}
		
	}

	@Override
	public List<Dipirona> getAll() {
		
		return listDip;
	}

	@Override
	public Dipirona getById(int id) {
		for(Dipirona dipirona : listDip) {
			if(dipirona.getId()==id) {
				return dipirona;
			}
		}
		return null;
	}
	
}
