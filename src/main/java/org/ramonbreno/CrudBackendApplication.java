package org.ramonbreno;

import org.ramonbreno.entities.Loja;
import org.ramonbreno.repositories.LojaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudBackendApplication implements CommandLineRunner {
	@Autowired
	private LojaRepository lojaRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(CrudBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		lojaRepository.save(new Loja("one", "one", 350.2));
		lojaRepository.save(new Loja("two", "one", 460.99));
		lojaRepository.save(new Loja("three", "one", 800.00));
		
	}
}
