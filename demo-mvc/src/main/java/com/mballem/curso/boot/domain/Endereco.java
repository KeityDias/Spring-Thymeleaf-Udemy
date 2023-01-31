package com.mballem.curso.boot.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table (name = "ENDERECOS")
public class Endereco extends AbstractEntity<Long> {
	
	@Column(nullable = false) //Garante que o campo seja obrigatório;
	private String logradouro;
	
	@Column(nullable = false) //Garante que o campo seja obrigatório;
	private String bairro;
	
	@Column(nullable = false) //Garante que o campo seja obrigatório;
	private String cidade;
	
	@Column(nullable = false, length = 2) //Garante que o campo seja obrigatório;
	@Enumerated (EnumType.STRING)//Informa a JPA o tipo de dados que desejo salvar no BD.
	private UF uf; //objeto do tipo UF, chamado uf
	
	@Column(nullable = false, length = 9) //Garante que o campo seja obrigatório;
	private String cep;
	
	@Column(nullable = false, length = 5) //Garante que o campo seja obrigatório;
	private Integer numero;
	
	//Não tem a anotação column por não ser obrigatório e seu tamanho será padrão (250 caracteres).
	private String complemento;

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public UF getUf() {
		return uf;
	}

	public void setUf(UF uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
}
