package oop1;

import java.io.IOException;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) throws IOException {
	
		//Day 1. Counter
		Counter zero = new Counter ();
		Counter cnt = new Counter (10);
		cnt.Inc();
		System.out.println("zero counter value: " + zero.value);
		System.out.println("cnt counter value: " + cnt.value);
		
		//Day2. Animal (nu)
		String nombre = "Pepito";
		LocalDate fecha = LocalDate.now();
		Animal uno = new Animal (nombre,fecha);
		System.out.println(uno.toString());
		
		//Day3. MoneyBox
		MoneyBox poor = new MoneyBox();
		MoneyBox accomodated = new MoneyBox(0,0,0,2,4,8);
		MoneyBox rich = new MoneyBox (1337);
		accomodated.getCoins();
		rich.getBills();
		rich.addMoney(2);
		System.out.println("To change poor's box pass");
		poor.setPassword("bruh");
		System.out.println("To open poor's box ");
		poor.openBox();
		poor.addMoney(39);
		poor.closeBox();
		System.out.println("To open rich's box ");
		rich.openBox();
		rich.withdrawMoney(390);
		rich.getValue();
		
		
		

	}

}