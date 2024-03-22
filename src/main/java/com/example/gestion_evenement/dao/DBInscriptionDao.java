package com.example.gestion_evenement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gestion_evenement.models.Inscription;

public interface DBInscriptionDao extends JpaRepository<Inscription, Long> {

}
