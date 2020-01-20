package com.lojaInformatica.lojaInformatica.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.lojaInformatica.lojaInformatica.model.Computador;
import com.lojaInformatica.lojaInformatica.service.IServicoComputador;
import com.lojaInformatica.lojaInformatica.service.impl.ServicoComputadorImpl;

@CrossOrigin("*")
@RestController
public class ComputadorController {
	IServicoComputador servicoComputador= new ServicoComputadorImpl();
	
	@GetMapping("/computador/")
	public List<Computador> getAll() {
		return servicoComputador.getAll();
	}
	
	@GetMapping("/computador/{id}")
	public ResponseEntity<Computador> getById(@PathVariable int id) {
		return ResponseEntity.ok(servicoComputador.getById(id));
	}
	
	@PostMapping("/computador/")
	public ResponseEntity<Computador> insert(@RequestBody Computador computador) {
		return ResponseEntity.ok(servicoComputador.insert(computador));
	}
	
	@PutMapping("/computador/")
	public Computador alterar(@RequestBody Computador computador) {
		servicoComputador.update(computador);
		return computador;
	}
	@DeleteMapping("/computador/{id}")
	public void delete(@PathVariable int id) {
		servicoComputador.delete(id);
	}

}
