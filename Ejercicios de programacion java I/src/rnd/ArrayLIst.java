package rnd;

import java.util.ArrayList;



public class ArrayLIst {

	public static void main(String[] args) {
		
		ArrayList<String> array = new ArrayList<>();
		array.add("hola");
		array.add("mundo");
		System.out.println(array.get(0));
		System.out.println(array.size());
		for (int indice=0; indice< array.size();indice++) {
			System.out.println(array.get(indice));
		}
		for(String s:array) {
			System.out.println(s);
		}
		
	}
	

}
