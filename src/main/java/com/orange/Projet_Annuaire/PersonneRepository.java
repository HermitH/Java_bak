package com.orange.Projet_Annuaire;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PersonneRepository extends CrudRepository<Personne, Integer> {
	List<Personne> findAll();

	Personne findById(int id);

	List<Personne> findByName(String name);
}
