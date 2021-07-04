package com.nataliaF.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Entity
@Data
public class Exame implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotNull(message = "Erro: o campo hemograma deve ser true ou false.")
	private boolean hemograma;
	
	@NotNull(message = "Erro: o campo colesterol deve ser true ou false.")
	private boolean colesterol;
	
	@NotNull(message = "Erro: o campo fosforo deve ser true ou false.")
	private boolean fosforo;

	@NotNull(message = "Erro: o campo cálcio deve ser true ou false.")
	private boolean calcio;
	
	@NotNull(message = "Erro: o campo glicose deve ser true ou false.")
	private boolean glicose;
	
	@NotNull(message = "Erro: o campo magnésio deve ser true ou false.")
	private boolean magnesio;
	
	@NotNull(message = "Erro: o campo uréia deve ser true ou false.")
	private boolean ureia;
	
	@NotNull(message = "Erro: o campo potássio deve ser true ou false.")
	private boolean potassio;
	
	@NotNull(message = "Erro: o campo ultrassonografia não pode ser nulo/vazio")
	private String ultrassonografia;
	
	@NotNull(message = "Erro: o campo radiografia não pode ser nulo/vazio")
	private String radiorafia;
	
	@Pattern(regexp = "^((19|2[0-9])[0-9]{2})-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$",
			message="A data deve conter o formato aaaa-dd-mm")
	private Date data;
	
	
}