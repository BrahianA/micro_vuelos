package com.mitocode.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCliente;
	private char Tipo_Documento;
	private int Numero_Identificacion;
	private String Nombres;
	private String Apellidos;
	private Date Fecha_Nacimiento;
	private char sexo;
	private int Telefono;
	
	
	public Usuario() {
		
	}


	public Usuario(int idCliente, char tipo_Documento, int numero_Identificacion, String nombres, String apellidos,
			Date fecha_Nacimiento, char sexo, int telefono) {
		super();
		this.idCliente = idCliente;
		Tipo_Documento = tipo_Documento;
		Numero_Identificacion = numero_Identificacion;
		Nombres = nombres;
		Apellidos = apellidos;
		Fecha_Nacimiento = fecha_Nacimiento;
		this.sexo = sexo;
		Telefono = telefono;
	}


	public int getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}


	public char getTipo_Documento() {
		return Tipo_Documento;
	}


	public void setTipo_Documento(char tipo_Documento) {
		Tipo_Documento = tipo_Documento;
	}


	public int getNumero_Identificacion() {
		return Numero_Identificacion;
	}


	public void setNumero_Identificacion(int numero_Identificacion) {
		Numero_Identificacion = numero_Identificacion;
	}


	public String getNombres() {
		return Nombres;
	}


	public void setNombres(String nombres) {
		Nombres = nombres;
	}


	public String getApellidos() {
		return Apellidos;
	}


	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}


	public Date getFecha_Nacimiento() {
		return Fecha_Nacimiento;
	}


	public void setFecha_Nacimiento(Date fecha_Nacimiento) {
		Fecha_Nacimiento = fecha_Nacimiento;
	}


	public char getSexo() {
		return sexo;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}


	public int getTelefono() {
		return Telefono;
	}


	public void setTelefono(int telefono) {
		Telefono = telefono;
	}
	
	

}
