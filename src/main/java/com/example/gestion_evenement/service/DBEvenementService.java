package com.example.gestion_evenement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.gestion_evenement.dao.DBEvenementDao;
import com.example.gestion_evenement.models.Evenement;

@Service
public class DBEvenementService {

	DBEvenementDao dbEvenementDao;
	
	public DBEvenementService(DBEvenementDao dbEvenementDao) {
		this.dbEvenementDao = dbEvenementDao;
	}
	
	public List<Evenement> findAll(){
		return dbEvenementDao.findAll();
	}
	
	public Evenement create(Evenement evenement) {
		dbEvenementDao.save(evenement);
		return evenement;
	}
	
	public void delete(Long id) {
		dbEvenementDao.deleteById(id);
	}
	
	public Evenement findByName(String name) {
		return dbEvenementDao.findByName(name);
	}
}
