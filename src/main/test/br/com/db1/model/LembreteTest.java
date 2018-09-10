package br.com.db1.model;

import javax.persistence.Query;

import org.junit.Test;

public class LembreteTest extends AbstractTest{
	
	@Test
	public void inserirTest() {
		Lembrete lembrete = new Lembrete();
		lembrete.setDescricao("1 2 3 testando");

		manager.getTransaction().begin();
		manager.persist(lembrete);
		manager.getTransaction().commit();
	}
	
	@Test
	public void listarTest(){
		
	}

}
