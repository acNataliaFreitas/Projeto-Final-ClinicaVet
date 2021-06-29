package com.nataliaF.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
@Data
public class Anamnese implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToMany
	private List<Doenca> doenca = new ArrayList<Doenca>();
	
	private String problemaSistemaDigestivo;
	private String problemaSistemaUrogenital;
	private String problemaSistemaCardioRespiratorio;
	private String problemaSistemaNeurologica;
	private String problemaSistemaLocomotor;
	private String problemaPele;
	private String problemaolhos;
	private String problemaOuvido;
	

	
}
