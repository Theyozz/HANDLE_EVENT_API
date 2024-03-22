package com.example.gestion_evenement.controller;

import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gestion_evenement.models.Evenement;
import com.example.gestion_evenement.service.DBEvenementService;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/evenement")
public class EvenementController {

	private DBEvenementService dbEvenementService;
	
	public EvenementController(DBEvenementService dbEvenementService) {
		this.dbEvenementService = dbEvenementService;
	}

    @GetMapping
    public List<Evenement> findAll() {
        return dbEvenementService.findAll();
    }
    
    @PostMapping("/createEvenement")
    public Evenement create(@RequestBody Evenement evenement) {
    	dbEvenementService.create(evenement);
    	return evenement;
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
    	dbEvenementService.delete(id);
    }
    
    @GetMapping("/{name}")
    public Evenement findByName(@PathVariable("name") String name) {
    	return dbEvenementService.findByName(name);
    }
}
