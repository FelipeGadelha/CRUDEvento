package br.com.portifolio.evento.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.portifolio.evento.entidades.Palestra;

public class PalestraDAO {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("evento");
	
	public EntityManager getEntityManager() {
		
		return emf.createEntityManager();
	}
	
	
	public Palestra salvar(Palestra palestra) throws Exception{
		
		EntityManager em = getEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(palestra);//executa o insert
			em.getTransaction().commit();
		}finally {
			em.close();
		}
		return palestra;
	}
	
	public void remover(int id){
		EntityManager em = getEntityManager();
		try {
			em.getTransaction().begin();
			Palestra p = em.find(Palestra.class, id);
			em.remove(p);
			em.getTransaction().commit();
		}finally {
			em.close();
		}
		
	}
	
	public Palestra consultarPorId(int id) {
		EntityManager em = getEntityManager();
		Palestra p = null;
		try {
			p = em.find(Palestra.class, id);
		}finally {
			em.close();
		}
		return p;
	}
}





















