package com.nataliaF.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Entity
@Data
public class Consulta implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToOne
	private Anamnese anamnese;
	
	@Pattern(regexp = "^((19|2[0-9])[0-9]{2})-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$",
			message="A data deve conter o formato aaaa-dd-mm")
	private Date Data;
	
	@NotNull(message="O campo observações nao pode ser nulo/vazio")
	private String observacoes;
	
	@NotNull(message="O campo queixa nao pode ser nulo/vazio")
	private String quiexa;
	
	@NotNull(message="O campo historico nao pode ser nulo/vazio")
	private String historico;
	
}
