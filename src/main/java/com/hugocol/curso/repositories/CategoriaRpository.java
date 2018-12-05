package com.hugocol.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hugocol.curso.domain.Categoria;

@Repository
public interface CategoriaRpository extends JpaRepository<Categoria, Integer> {

}
