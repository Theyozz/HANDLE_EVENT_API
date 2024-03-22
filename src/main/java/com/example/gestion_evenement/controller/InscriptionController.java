package com.example.gestion_evenement.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gestion_evenement.models.Inscription;
import com.example.gestion_evenement.service.DBInscriptionService;

@RestController
@RequestMapping("/api/v1/inscription")
public class InscriptionController {
	
	private DBInscriptionService dbInscriptionService;
	
	public InscriptionController(DBInscriptionService dbInscriptionService) {
		this.dbInscriptionService = dbInscriptionService;
	}
	
    @GetMapping
    public List<Inscription> findAll() {
        return dbInscriptionService.findAll();
    }
    
    @PostMapping("/createInscription")
    public Inscription create(@RequestBody Inscription inscription) {
    	return dbInscriptionService.create(inscription);
    }
    
    @DeleteMapping("/{id}")
    public void delete(Long id) {
    	dbInscriptionService.delete(id);
    }

}
