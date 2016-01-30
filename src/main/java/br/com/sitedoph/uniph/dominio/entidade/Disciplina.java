package br.com.sitedoph.uniph.dominio.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table (name = "TB_DISCIPLINA")
public class Disciplina {
	@Id
	@GeneratedValue
	@Column (name = "ID")
	private Long id;
	
	@Column (name = "DESCRICAO")
	private String descricao;
	
	@ManyToOne //tipo de relacionamento 1 pra muito da entidade professor
	@Column (name = "PROFESSOR")
	private Professor professor;
	
	@Column (name = "CARGAHORARIA")
	private String cargahoraria;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public String getCargahoraria() {
		return cargahoraria;
	}

	public void setCargahoraria(String cargahoraria) {
		this.cargahoraria = cargahoraria;
	}

	
	
}
