package com.example.heladeria.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "cliente")

public class Cliente {
	
	@Id
	private Long identificacion;
	
	private String nombre;
	private String apellido;
	private String correo;
	private String celular;
		
	public Cliente () {
		
	}	
	public Cliente(Long identificacion, String nombre, String apellido, String correo, String celular) {
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.celular = celular;
	}
	public Long getIdentificacion() {
		return identificacion;
	}
	public void setId(Long identificacion) {
		this.identificacion = identificacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
}
