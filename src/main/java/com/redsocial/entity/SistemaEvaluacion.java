package com.redsocial.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "sistemaEvaluacion")
public class SistemaEvaluacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idSistemaEvaluacion")
	private int idSistemaEvaluacion;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "formula")
	private String formula;

	@Column(name = "estado")
	private String estado;

}
