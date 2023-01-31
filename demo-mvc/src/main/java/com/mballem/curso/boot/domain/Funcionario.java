package com.mballem.curso.boot.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table (name = "FUNCIONARIOS")
public class Funcionario extends AbstractEntity<Long> {
	
	@Column (nullable= false, unique= true)//Tem anotações por ser um campo obrigatório. Também possui restrições.
	private String nome;
	
	@Column (nullable= false, columnDefinition = "DECIMAL(7,2) DEFAULT 0.00")//7 dig e 2 casas após a vírgula. DEFAULT: caso não tenha nenhum valor adicionado, no lugar de "null", aparece 0.00;
	private BigDecimal salario;
	
	@Column (name= "data_entrada", nullable= false, columnDefinition= "DATE")
	private LocalDate dataEntrada;
	
	@Column (name= "data_saida",  columnDefinition= "DATE")
	private LocalDate dataSaida;
	
	@OneToOne(cascade= CascadeType.ALL)//Quando for cadastrar, edita ou excluir um funcionário, será inserido por cascata um endereço;
	@JoinColumn (name = "endereco_id_fk") //Nomeia a chave estrangeira na tabela de funcionários;
	private Endereco endereco;
	
	@ManyToOne //Um cargo pode ter muitos funcionários, mas um funcionário possui um único cargo;
	@JoinColumn
	private Cargo cargo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public LocalDate getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(LocalDate dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public LocalDate getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(LocalDate dataSaida) {
		this.dataSaida = dataSaida;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	
	
	
}
