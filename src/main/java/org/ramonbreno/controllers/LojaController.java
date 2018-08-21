package org.ramonbreno.controllers;

import java.util.Collection;
import java.util.List;

import org.ramonbreno.entities.Loja;
import org.ramonbreno.repositories.LojaRepository;
import org.ramonbreno.service.LojaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
public class LojaController {
	@Autowired
	private LojaService lojaService;
	@Autowired
	private LojaRepository lojaRepository;

	@RequestMapping(method=RequestMethod.GET, value="/lojas" , produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<Loja>> getLojas() {
		Collection<Loja> getLojas = lojaService.buscarTodos();
		return new ResponseEntity<>(getLojas, HttpStatus.OK);
	}

	@GetMapping("/loja/{id}")
	public Loja getLoja(@PathVariable Integer id) {
		return lojaRepository.findOne(id);
	}

	@DeleteMapping("/loja/{id}")
	public boolean deleteLoja(@PathVariable Integer id) {
		lojaRepository.delete(id);
		return true;
	}

	@PutMapping("/loja")
	public Loja updateLoja(@RequestBody Loja loja) {
		return lojaRepository.save(loja);
	}

	@PostMapping("/loja")
	public ResponseEntity<Loja> createLoja(@RequestBody Loja loja) {
		
		Loja lojaCadastrada = lojaService.cadastrar(loja);
		
		return new ResponseEntity<Loja>(lojaCadastrada, HttpStatus.CREATED);
		//return lojaRepository.save(loja);
	}
}
