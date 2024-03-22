package com.example.gestion_evenement.service;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.gestion_evenement.dao.DBInscriptionDao;
import com.example.gestion_evenement.models.Inscription;

@Service
public class DBInscriptionService {

	DBInscriptionDao dbInscriptionDao;
	
	public DBInscriptionService(DBInscriptionDao dbInscriptionDao) {
		this.dbInscriptionDao = dbInscriptionDao;
	}
	
	public List<Inscription> findAll(){
		return dbInscriptionDao.findAll();
	}
	
	public Inscription create(Inscription inscription) {
		return dbInscriptionDao.save(inscription);
	}
	
	public void delete(Long id) {
		dbInscriptionDao.deleteById(id);
	}
}
