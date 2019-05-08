package br.com.portifolio.evento.entidades;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Palestrante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String miniBio;
	@ManyToOne(cascade = CascadeType.ALL)
	private Palestra palestra;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMiniBio() {
		return miniBio;
	}
	public void setMiniBio(String miniBio) {
		this.miniBio = miniBio;
	}
	public Palestra getPalestra() {
		return palestra;
	}
	public void setPalestra(Palestra palestra) {
		this.palestra = palestra;
	}
	

}
