package br.com.portifolio.evento.entidades;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Palestra {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String titulo;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataHora;
	private int duracao;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Local local;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "palestra")
	private List<Palestrante> palestrantes;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public List<Palestrante> getPalestrantes() {
		return palestrantes;
	}

	public void setPalestrantes(List<Palestrante> palestrantes) {
		this.palestrantes = palestrantes;
	}
	
	

}
