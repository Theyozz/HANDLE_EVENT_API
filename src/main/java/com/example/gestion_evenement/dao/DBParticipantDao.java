package com.example.gestion_evenement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gestion_evenement.models.Participant;

public interface DBParticipantDao extends JpaRepository<Participant, Long> {

}
