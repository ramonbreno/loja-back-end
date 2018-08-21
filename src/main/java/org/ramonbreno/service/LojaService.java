package org.ramonbreno.service;

import java.util.Collection;

import org.ramonbreno.entities.Loja;
import org.ramonbreno.repositories.LojaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LojaService {
	@Autowired
	private LojaRepository lojaRepository;
	
	public Loja cadastrar(Loja loja) {
		return lojaRepository.save(loja);		
	}
	public Collection<Loja> buscarTodos(){
		return lojaRepository.findAll();
	}
	/*public void excluir(Loja cliente) {
		lojaRepository.delete(cliente);
	}
	public Loja alterar(Loja loja) {
		return lojaRepository.save(loja);
	}*/
}
