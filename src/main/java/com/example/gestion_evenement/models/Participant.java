package com.example.gestion_evenement.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Participant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 50)
	private String firstname;
	
	@Column(length = 50)
	private String lastname;
	
	@Column(length = 255)
	@Size(min = 4, message = "Le mot de passe doit contenir au minimum 4 caractères")
	private String password;
	
	@Email(message = "Le format d'adresse n'est pas valide")
	@Column(unique = true, nullable = false, length = 255)
	private String email;
	
	@Column(nullable = false)
	private int age;
	
	@OneToMany(mappedBy = "participant")
	private List<Inscription> inscriptions;

	public Participant(Long id, String firstname, String lastname, String password, String email, int age) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.email = email;
		this.age = age;
		this.inscriptions = new ArrayList<>();
	}
	
	public Participant(Long id) {
		this.id = id;
	}
	
	public Participant() {
		
	}
	
}
