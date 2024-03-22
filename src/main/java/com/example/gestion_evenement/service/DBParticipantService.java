package com.example.gestion_evenement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.gestion_evenement.dao.DBParticipantDao;
import com.example.gestion_evenement.models.Participant;

@Service
public class DBParticipantService {

	DBParticipantDao dbParticipantDao;
	
	public DBParticipantService(DBParticipantDao dbParticipantDao) {
		this.dbParticipantDao = dbParticipantDao;
	}
	
	public List<Participant> findAll(){
		return dbParticipantDao.findAll();
	}
	
	public Participant create(Participant participant) {
		return dbParticipantDao.save(participant);
	}
	
	public void delete(Long id) {
		dbParticipantDao.deleteById(id);
	}
	
	public Participant update(Participant participant) {
		return dbParticipantDao.save(participant);
	}
}
