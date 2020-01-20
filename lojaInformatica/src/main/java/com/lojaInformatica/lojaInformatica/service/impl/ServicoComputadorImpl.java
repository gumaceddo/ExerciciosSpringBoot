package com.lojaInformatica.lojaInformatica.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.lojaInformatica.lojaInformatica.model.Computador;
import com.lojaInformatica.lojaInformatica.service.IServicoComputador;

public class ServicoComputadorImpl  implements IServicoComputador{
	static List<Computador> listComput = new ArrayList<Computador>();
	private static int incr= 0;
	@Override
	public Computador insert(Computador computador) {
		incr++;
		computador.setId(incr);
		listComput.add(computador);
		return computador;
	}

	@Override
	public Computador update(Computador computador) {
		Computador aux= getById(computador.getId());
		if (aux != null) {
			aux.setNome(computador.getNome());
			aux.setValor(computador.getValor());
		}
		return aux;
	}

	@Override
	public void delete(int id) {
		int posicao= -1;
		for (int i = 0; i < this.listComput.size(); i++) {
			if (this.listComput.get(i).getId()== id) {
				posicao= i;
				break;	
			}
		}
		if (posicao>=0) {
			this.listComput.remove(posicao);
		}
		
	}

	@Override
	public List<Computador> getAll() {
		return listComput;
	}

	@Override
	public Computador getById(int id) {
		for (Computador computador : listComput) {
			if (computador.getId()== id) {
				return computador;
			}
		}
		
		return null;
	}

}
