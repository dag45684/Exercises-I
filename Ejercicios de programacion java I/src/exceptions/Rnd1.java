package exceptions;

import java.util.Scanner;

public class Rnd1 {

	int[] array;

//	int[] array = new int[10];
//	this would solve the array nullptr exception

	public static void main(String[] args) {
		//if we dont want to catch an exception but we have a method
		//which throws one, we declare "throws NameOfTheException"
		//right after the args closing parenthesis in the method
		
		System.out.println(new Rnd1());
		
		Scanner scanner = new Scanner (System.in);
		int n = Integer.parseInt(scanner.nextLine());
		System.out.println(n * 2);
		scanner.close();
		//provided this could not translate a string input to
		//an int, it would throw Unchecked exception
		//NumberFormatException
		//to avoid this we would use Try Catch method like so:

		int m=0;
		try {
			m = Integer.parseInt(scanner.nextLine());
			Thread.sleep(10000); //lol jk example
		} catch (NumberFormatException | NullPointerException e) {
		// if we want to treat them the same way we can delare it like so
			
		} catch (InterruptedException e) {
		// if we need a different teatment to this throw
		} finally {
		// this clause ensures the execution of its contents
		// whether an exception is trown or not within the try
			System.out.println("This will be printed for sure");
		}
		// if an exception extends another, only the superclass
		// gotta be declared e.g. EOFException, which extends IOException
		// if we want them separated, first we gotta declare the
		// subclass except. and then the superclass on a different catch

		System.out.println(m * m);
		System.out.println("No exceptions.");
	}

	@Override
	public String toString() {
		return array.toString();
		//this causes an exception
		//null reference to invoke toString method
		//provided our array is declared as: int[] array; 
		//nullpointerexception
	}
}
