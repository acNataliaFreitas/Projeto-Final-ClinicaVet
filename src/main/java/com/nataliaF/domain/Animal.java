package com.nataliaF.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Animal implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String foto;
	private String raca;
	private String pelagem;
	private int peso;
	private int tipo;
	private Date dt_nascimento;
	private Date dt_cadastro;
	private int estado;
	
	
	
	
	
}
