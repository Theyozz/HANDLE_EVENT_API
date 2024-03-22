package com.example.gestion_evenement.models;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Inscription {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private Evenement evenement;
	
	@ManyToOne
	private Participant participant;
	
	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime dateHours;

	public Inscription() {
		this.dateHours = LocalDateTime.now();
	}
	
	public Long getEvenement() {
		return evenement.getId();
	}
	
	public Long getParticipant() {
		return participant.getId();
	}
}
