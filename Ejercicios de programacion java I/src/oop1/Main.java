package oop1;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
	
		//Day 1. Counter
		Counter zero = new Counter ();
		Counter cnt = new Counter (10);
		cnt.Inc();
		System.out.println("zero counter value: " + zero.value);
		System.out.println("cnt counter value: " + cnt.value);
		
		//Day2. Animal
			String nombre = "Pepito";
			LocalDate fecha = LocalDate.now();
			Animal uno = new Animal (nombre,fecha);
			System.out.println(uno.toString());
			
			
		
		
		//Day3. (Nuria)
		
		
		
		

	}

}