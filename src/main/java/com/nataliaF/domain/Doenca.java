package com.nataliaF.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Doenca implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String nome;
}
