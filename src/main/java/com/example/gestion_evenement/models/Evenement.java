package com.example.gestion_evenement.models;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.example.gestion_evenement.enums.CategoryEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Evenement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 50)
	private String name;
	
	@Column(length = 50)
	private String description;
	
	@Column(length = 50)
	private String place;
	
	@Column(nullable = false)
	private CategoryEnum category;
	
	@Column(nullable = false)
	private LocalDate dateHours;
	
	@OneToMany(mappedBy = "evenement")
	private List<Inscription> inscriptions;

    public Evenement() {
        
    }
    
    public Evenement(Long id) {
    	this.id = id;
    }
	
	public Evenement(Long id,String name, String description, String place, CategoryEnum category,
			LocalDate dateHours) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.place = place;
		this.category = category;
		this.dateHours = dateHours;
		this.inscriptions = new ArrayList<>();
	}

}
