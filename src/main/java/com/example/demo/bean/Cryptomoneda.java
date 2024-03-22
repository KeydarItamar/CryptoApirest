package com.example.demo.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Cryptomoneda")
public class Cryptomoneda {
	
	private @Id @Column(name="id") @GeneratedValue(strategy=GenerationType.IDENTITY) int id;
	public String rutaImagen; 
	public String nombre;
	public double maxPrize;
	public double minimPrize;
	public String creador;
	public String descripcion;
	public String red;
	
	
	public Cryptomoneda(String rutaImagen, String nombre, double maxPrize, double minimPrize, String creador,
			String descripcion, String red) {
		super();
		this.rutaImagen = rutaImagen;
		this.nombre = nombre;
		this.maxPrize = maxPrize;
		this.minimPrize = minimPrize;
		this.creador = creador;
		this.descripcion = descripcion;
		this.red = red;
	}


	public Cryptomoneda() {
	
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getRutaImagen() {
		return rutaImagen;
	}


	public void setRutaImagen(String rutaImagen) {
		this.rutaImagen = rutaImagen;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getMaxPrize() {
		return maxPrize;
	}


	public void setMaxPrize(double maxPrize) {
		this.maxPrize = maxPrize;
	}


	public double getMinimPrize() {
		return minimPrize;
	}


	public void setMinimPrize(double minimPrize) {
		this.minimPrize = minimPrize;
	}


	public String getCreador() {
		return creador;
	}


	public void setCreador(String creador) {
		this.creador = creador;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getRed() {
		return red;
	}


	public void setRed(String red) {
		this.red = red;
	}


	@Override
	public String toString() {
		return "Cryptomoneda [rutaImagen=" + rutaImagen + ", nombre=" + nombre + ", maxPrize=" + maxPrize
				+ ", minimPrize=" + minimPrize + ", creador=" + creador + ", descripcion=" + descripcion + ", red="
				+ red + "]";
	} 
	
	
	
	
	
}
