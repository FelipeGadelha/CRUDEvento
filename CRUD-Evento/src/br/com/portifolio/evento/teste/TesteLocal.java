package br.com.portifolio.evento.teste;

import br.com.portifolio.evento.DAO.LocalDAO;
import br.com.portifolio.evento.entidades.Local;

public class TesteLocal {
	
	public static void main(String[] args) {
		
		Local local = new Local();
		
		local.setPredio("Lambda");
		local.setSala("L330");
		local.setCapacidade(80);
		
		LocalDAO dao = new LocalDAO();
		local = dao.salvar(local);//executa o insert
		
		System.out.println("Local salvo " + local.getId() + " " + local.getPredio() + " " + local.getSala() + " " + local.getCapacidade());
		
		Local l2 = dao.consultarPorId(Local.class, local.getId());//executa o select
		
		System.out.println("Consultando o local " + local.getId() + " " + local.getCapacidade());
		
		l2.setCapacidade(120);
		l2 = dao.salvar(l2);//executa o update
		
		System.out.println("Local salvo " + l2.getId() + " " + l2.getPredio() + " " + l2.getSala() + " " + l2.getCapacidade());
		
		
		
		dao.remover(Local.class, l2.getId());//executa o delete
	}
}
