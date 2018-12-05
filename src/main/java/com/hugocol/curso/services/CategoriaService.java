package com.hugocol.curso.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hugocol.curso.domain.Categoria;
import com.hugocol.curso.repositories.CategoriaRpository;

@Service
public class CategoriaService {

	@Autowired //instancia automaticamente 
	private CategoriaRpository repo;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
		}
}
