package com.orange.Projet_Annuaire;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AnnuaireRService implements AnnuaireTService {
	
	@Autowired
	PersonneRepository pr;
	
	
	public AnnuaireRService() {

	}

	@Override
	public Collection<Personne> getAll() {
		//return (Collection<Personne>) (hm.values());
		return pr.findAll();
	}

	@Override
	public Personne getFromId(int id) {
		//return hm.get(id);
		return pr.findById(id);
	}

	@Override
	public void deleteFromId(int id) {
		//if(hm.remove(id) != null) return true;
		//return false;
		pr.deleteById(id);
	}

	@Override
	public void addPersonne(Personne p) {
		//hm.put(p.getId(), p);
		pr.save(p);
	}
	
	
	@Override
	public Collection<Personne> findByName(String name) {
		return pr.findByName(name);
	}

}

