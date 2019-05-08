package br.com.portifolio.evento.teste;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import br.com.portifolio.evento.DAO.PalestraDAO;
import br.com.portifolio.evento.entidades.Local;
import br.com.portifolio.evento.entidades.Palestra;
import br.com.portifolio.evento.entidades.Palestrante;

public class TestePalestra {
	
	public static void main(String[] args) throws Exception {
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		Palestrante pa = new Palestrante();
		pa.setNome("Felipe Gadelha");
		pa.setMiniBio("Desenvolvedor Junior de JAVA");
		
		List<Palestrante> palestrantes = new ArrayList<>();
		palestrantes.add(pa);
		
		Local l = new Local();
		l.setPredio("Delta");
		l.setSala("D123");
		l.setCapacidade(60);
		
		Palestra p = new Palestra();
		p.setTitulo("Relacionamento com JPA");
		p.setLocal(l);
		p.setDuracao(100);
		p.setDataHora(df.parse("26/09/2014 19:00"));
		
		pa.setPalestra(p);
		
		PalestraDAO dao = new PalestraDAO();
		
		Palestra p2 = dao.consultarPorId(2);
		
		System.out.println("Palestra " + p2.getTitulo() + " no local " + p.getLocal().getPredio());
//		p = dao.salvar(p);
//		System.out.println("palestra " + p.getTitulo() + " salva");
//		
//		dao.remover(p.getId());
		
//		EntityManager em = new PalestraDAO().getEntityManager(); 
//		em.getTransaction().begin();
//		em.merge(p);
//		em.getTransaction().commit();
//		em.close();
		
	}
	
	

}
