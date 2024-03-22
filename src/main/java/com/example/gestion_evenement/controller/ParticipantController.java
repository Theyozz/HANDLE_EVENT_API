package com.example.gestion_evenement.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gestion_evenement.models.Participant;
import com.example.gestion_evenement.service.DBParticipantService;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/participant")
public class ParticipantController {
	
	private DBParticipantService dbParticipantService;
	
	public ParticipantController(DBParticipantService dbParticipantService) {
		this.dbParticipantService = dbParticipantService;
	}
	
    @GetMapping
    public List<Participant> findAll() {
        return dbParticipantService.findAll();
    }
    
    @PostMapping("/createParticipant")
    public Participant create(@RequestBody Participant participant) {
    	dbParticipantService.create(participant);
    	return participant;
    }
    
    @PutMapping
    public Participant update(Participant participant) {
    	return dbParticipantService.update(participant);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
    	dbParticipantService.delete(id);
    }

}
