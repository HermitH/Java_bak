package com.orange.Projet_Annuaire;

import java.util.Collection;


public interface AnnuaireTService {
public Collection<Personne> getAll();
public Personne getFromId(int id);
public Collection<Personne> findByName(String name);
public void deleteFromId(int id);
public void addPersonne(Personne p);
}