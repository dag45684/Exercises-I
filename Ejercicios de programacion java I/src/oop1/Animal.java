package oop1;

import java.time.LocalDate;

public class Animal {

	String nombre;
	LocalDate fecha;
	
	Animal( String nombre , LocalDate fecha){
		this.fecha = fecha;
		this.nombre = nombre;
		
	}
	Animal(String nombre){
		this.nombre = nombre;
		fecha = LocalDate.now();
	}
	public void setNombre ( String nombre) {
		 this.nombre = nombre;
	}
	public void setFecha (LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getNombre () {
		return nombre;
	}
	public LocalDate getFecha () {
		return fecha;
	}
	public String toString () {
		return "Nombre: " +nombre +"- Edad: " +fecha;
	}

}
