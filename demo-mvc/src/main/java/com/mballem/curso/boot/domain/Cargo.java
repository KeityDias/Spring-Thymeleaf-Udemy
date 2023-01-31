package com.mballem.curso.boot.domain;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@SuppressWarnings("serial")
@Entity
@Table (name = "CARGOS")
public class Cargo extends AbstractEntity<Long> {
	
	@Column(name="nome", nullable = false, unique = true, length =60)
	private String nome;
	
	@ManyToOne //Um departamento (objeto departamento declarado, to tipo Departamento) poderá ter muitos cargos (nome da classe)
	@JoinColumn (name = "id_departamento_fk")// Nome da chave estrangeira que consta na tabela cargos;
	private Departamento departamento; //Referencia a chave estrangeira;

	@OneToMany(mappedBy = "cargo")// Mts funcionários para um cargo
	private List<Funcionario> funcionario;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<Funcionario> getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(List<Funcionario> funcionario) {
		this.funcionario = funcionario;
	}
	
	
}
