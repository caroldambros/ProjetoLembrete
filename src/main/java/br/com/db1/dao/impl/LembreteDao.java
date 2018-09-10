package br.com.db1.dao.impl;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.hibernate.Query;

import br.com.db1.dao.DAO;
import br.com.db1.model.Lembrete;

public class LembreteDao implements DAO<Lembrete>{
	
private EntityManager manager;
	
	@Inject
	public LembreteDao(EntityManager manager){
		this.manager = manager;
	}
	
	public 
	
	public List<Lembrete> listar() {
		return manager.createQuery("from lembrete").getResultList();
	}
	
	

}
