package com.mballem.curso.boot.domain;

import java.io.Serializable;
import java.util.Objects;

import org.yaml.snakeyaml.events.Event.ID;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@SuppressWarnings("serial") /*Omite um warning: Estava pedindo pra gerar um Id serial porque foi implementado a Serializable, mas 
não será necessário porque o próprio JDK vai gerar um serial automático quando a classe for compilada.*/

/**
 * É definido um tipo genérico para que a implementação das classes filhas escolham qual o tipo
 * de ID que será utilizado (interger, long, etc);
 * - A interface Serializable é implementada pelo padrão de boas práticas toda vez que você usa ORM;
 * - Todas as classes filhas serão também serializadas automaticamente.
 * @author keity
 *
 * @param <id>
 */
@MappedSuperclass
public abstract class AbstractEntity <id extends Serializable> implements Serializable {

	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private ID id;

	public ID getId() {
		return id;
	}

	public void setId(ID id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractEntity <?> other = (AbstractEntity<?>) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		}else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return  "id=" + id;
	}
	
	
		
}
