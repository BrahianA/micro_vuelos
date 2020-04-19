package com.example.demo.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="vuelo")
public class Vuelo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVuelo;
	@Column(name = "numeroVuelo")
	private int numeroVuelo;
	@Column(name = "capacidad")
	private int capacidad;
	@Column(name = "modeloAvion")
	private String modeloAvion;
	@Column(name = "fechaVuelo")
	private Date  fechaVuelo;
	
	
	public Vuelo() {
		super();
		
	}


	public Vuelo(Long idVuelo, int numeroVuelo, int capacidad, String modeloAvion, Date fechaVuelo) {
		super();
		this.idVuelo = idVuelo;
		this.numeroVuelo = numeroVuelo;
		this.capacidad = capacidad;
		this.modeloAvion = modeloAvion;
		this.fechaVuelo = fechaVuelo;
	}


	public Long getIdVuelo() {
		return idVuelo;
	}


	public void setIdVuelo(Long idVuelo) {
		this.idVuelo = idVuelo;
	}


	public int getNumeroVuelo() {
		return numeroVuelo;
	}


	public void setNumeroVuelo(int numeroVuelo) {
		this.numeroVuelo = numeroVuelo;
	}


	public int getCapacidad() {
		return capacidad;
	}


	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}


	public String getModeloAvion() {
		return modeloAvion;
	}


	public void setModeloAvion(String modeloAvion) {
		this.modeloAvion = modeloAvion;
	}


	public Date getFechaVuelo() {
		return fechaVuelo;
	}


	public void setFechaVuelo(Date fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}


	@Override
	public String toString() {
		return "Vuelo [idVuelo=" + idVuelo + ", numeroVuelo=" + numeroVuelo + ", capacidad=" + capacidad
				+ ", modeloAvion=" + modeloAvion + ", fechaVuelo=" + fechaVuelo + "]";
	}
	
	
	

	
	}


