package br.com.sitedoph.uniph.infraestrutura.persistencia;

import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.junit.Test;

import br.com.sitedoph.uniph.dominio.entidade.Aluno;

public class PersistenciaTeste {

	@Test
	public void deveCriarOEntityManagerFactoryEEntityManagere() {
		
		EntityManager em = JPAUtil.getEntityManager();
		em.close();
		
	}
	
	@Test
	public void devePersistirUmAluno() {
		
		EntityManager em = JPAUtil.getEntityManager();
		
		Aluno ze = new Aluno();
		ze.setNomeCompleto("José Roberto");
		ze.setCpf("88-888-888-17");
		ze.setDataDeCadastro(Calendar.getInstance());
		ze.setEmail("jose@gmail.com");
		ze.setRg("2.445.667");
		ze.setTelefone("(81)0987-0987");
		
		//INSERINDO DADOS DO OBJETO CRIADO ACIMA
		em.getTransaction().begin();//iniciando uma transação.
		em.persist(ze);// realizando tranzação
		em.getTransaction().commit();// Fim da tranzação
		
		
		// VERIFICA SE OBJETO FOI CRIADO -- LISTANDO
		//HQL
		Query  query = em.createQuery("SELECT a FROM Aluno a");
		List<Aluno> list = query.getResultList();
		
		for (Aluno a : list){
			System.out.println(a.getId()+"--"+a.getNomeCompleto()+"--"+ a.getEmail()+"--"+a.getRg());
		}

		
		em.close();
	}
	

}
