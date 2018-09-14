package br.edu.ifms.atividades.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Atividade {
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String materia;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public Atividade() {
		super();
	}
	public Atividade(Long id, String nome, String materia) {
		super();
		this.id = id;
		this.nome = nome;
		this.materia = materia;
	}
	@Override
	public String toString() {
		return "Atividade [id=" + id + ", nome=" + nome + ", materia=" + materia + "]";
	}
	
	
	
	
}
