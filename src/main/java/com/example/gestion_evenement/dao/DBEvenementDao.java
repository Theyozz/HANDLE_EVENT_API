package com.example.gestion_evenement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gestion_evenement.models.Evenement;

public interface DBEvenementDao  extends JpaRepository<Evenement, Long>{

	public Evenement findByName(String name);
}
