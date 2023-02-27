package part3;

import java.io.*;
import java.util.Arrays;

public class Exercise14p3 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input the number of sequences to input");
		int[][] arr = new int[Integer.parseInt(br.readLine())][];
		for (int i=0; i<arr.length; i++) {
			System.out.println("Input the cuantity of numbers to input");
			arr[i]= new int [Integer.parseInt(br.readLine())];
			boolean ok = false;
			do {
				try {
					System.out.println("Input the numbers separated by spc");
					arr[i]= Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(); //god i love this line
					//method reference Integer::parseInt can also be a lambda
					ok=true;
				}catch (StackOverflowError | NumberFormatException e) {
					System.out.println("Wrong input format. Please try again.");
				}
			}while(!ok); //dowhile creates the needed sized array, turning the size declaration useless and so the catchtry.
		}
		System.out.println("Your sequences:\n");
		for (int[] x : arr) System.out.println(Arrays.toString(x));

	}
}
