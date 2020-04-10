package br.com.santiago.clinicajm.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.santiago.clinicajm.domain.enumeration.Especialidade;

@Entity
public class Medico implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7898145301135395472L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_MEDICO")
	private Integer id;
	
	private String nome;

	@Enumerated(EnumType.STRING)
	private Especialidade especialidade;

}
