package br.com.db1.dao.impl;

import javax.persistence.Query;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.model.Lembrete;

public class LembreteDaoTest extends AbstractTestCase {
	
	private LembreteDao dao;
	
	@Before
	public void init() {
		dao = new LembreteDao(manager);
	}
	
	@Test
	public void InserirTest(){
		
	}

	@Test
	public void listarTest() {
		Query queryLembrete = manager.createNativeQuery("DELETE FROM lembrete");
		queryLembrete.executeUpdate();

		


	}
	

}
