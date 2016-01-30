package br.com.sitedoph.uniph.infraestrutura.persistencia;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

public class PersistenciaTeste {

	@Test
	public void deveCriarOEntityManagerFactoryEEntityManagere() {
		
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("uniph");
		EntityManager em = emFactory.createEntityManager();
		em.close();
		
	}

}
