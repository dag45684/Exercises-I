package oop1;

public class Writter {
		
	private String nombre;
	private String email;
	private String genero;
	
	public Writter(String nombre, String email, String genero) {
		this.nombre = nombre;
		this.email = email;
		this.genero = genero;
	}
	public String getEmail() {
		return email;
	}
	public String getNombre() {
		return nombre;
	}
	public String getGenero() {
		return genero;
	}
	public  void setEmail(String email) {
		this.email = email;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setGenero (String genero) {
		this.genero = genero;
	}
	@Override
	public String toString () {
		return "\"" + nombre + "(" + genero + ")" + email+ "\"";
		
	}
}
