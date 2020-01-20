package com.generation.Farmacia.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.generation.Farmacia.model.Dipirona;
import com.generation.Farmacia.service.IServiceDipirona;
import com.generation.Farmacia.service.impl.ServicoDipironaImpl;



@CrossOrigin("*")
@RestController
public class DipironaController {
	IServiceDipirona servicoDipirona = new ServicoDipironaImpl();
	
	@GetMapping("/dipirona/")
		public List<Dipirona> getAll(){
			return servicoDipirona.getAll();
	}
	@GetMapping ("dipirona/{id}")
		public ResponseEntity<Dipirona> getById (@PathVariable int id){
		return ResponseEntity.ok(servicoDipirona.getById(id));
	}
	@PostMapping("/dipirona/")
		public ResponseEntity<Dipirona> insert (@RequestBody Dipirona dipirona){
			return ResponseEntity.ok(servicoDipirona.insert(dipirona));
	}
	@PutMapping("/dipirona/")
		public Dipirona alterar(@RequestBody Dipirona dipirona) {
		servicoDipirona.update(dipirona);
		return dipirona;
	}
	@DeleteMapping("/dipirona/{id}")
		public void delete (@PathVariable int id) {
			servicoDipirona.delete(id);
	}
	
}
