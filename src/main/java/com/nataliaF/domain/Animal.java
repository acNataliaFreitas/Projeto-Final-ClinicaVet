package com.nataliaF.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Entity
@Data
public class Animal implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToMany
	private List<Exame> exames = new ArrayList<Exame>();
	
	@OneToMany
	private List<Consulta> consultas = new ArrayList<Consulta>();

	
	@NotBlank(message="O campo nome é obrigatório")
	private String nome;
	
	@NotNull(message = "O campo foto não pode ser nulo.")
	private String foto;
	
	@NotBlank(message="O campo raça é obrigatório")
	private String raca;
	
	@NotBlank(message="O campo pelagem é obrigatório")
	private String pelagem;
	
	@Digits(integer= 3, fraction= 4, message = "Erro: Insira o valor de peso do animal entre 0 e 1000.")
	@Min(value = 0, message = "Erro: Insira um valor superior a 0.")
	private boolean peso;
	
	@Min(value = 0, message = "Erro: Insira um valor superior a 0.")
	private int tipo;
	
	@Pattern(regexp = "^((19|2[0-9])[0-9]{2})-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$",
			message="A data deve conter o formato aaaa-dd-mm")
	private Date dt_nascimento;
	
	@Pattern(regexp = "^((19|2[0-9])[0-9]{2})-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$",
			message="A data deve conter o formato aaaa-dd-mm")
	private Date dt_cadastro;
	
	@NotNull
	private int estado;	
}
