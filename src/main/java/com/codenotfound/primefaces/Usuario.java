package com.codenotfound.primefaces;

import java.io.Serializable;

public class Usuario implements Serializable {
	private String nombre;

	private String apellido;

	private Integer edad;

	private String direccion;

	private String codigoPostal;

	private String ciudad;

	private int telefono;

	private String email;

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

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return " INFORMACIÓN SOBRE EL USUARIO: \n"
				+ "Nombre: "+this.getNombre()+" \n"
				+ "Apellidos: "+this.getApellido()+" \n"
				+ "Edad: "+this.getEdad()+" \n"
			+ "Dirección: "+this.getDireccion()+" \n"
			+ "Código postal: "+this.getCodigoPostal()+" \n"
			+ "Ciudad: "+this.getCiudad()+" \n"
			+ "E-mail: "+this.getEmail()+" \n"
			+ "Teléfono: "+this.getTelefono()+" \n";
	}
	
	
}
