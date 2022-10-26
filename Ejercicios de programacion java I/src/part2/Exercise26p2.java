//package firstev;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Exercise26p2 {
//
//	public static void main(String[] args) throws IOException {
//
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int[] n = new int[10];
//		for (int i=0; i<10; i++) {
//			System.out.println("Input a number to the array");
//			n[i]=Integer.parseInt(br.readLine());
//		}
//		for (int i=9; i>=0; i--) System.out.println(n[i]);
//	}
//
//}


//proper way:

package part2;

import java.util.Arrays;
import java.util.Random;

public class Exercise26p2 {

	public static void main(String[] args) {
		
		int[] n = new int[10];
		Random r =  new Random();
		for (int i=0; i<10; i++) n[i] = r.nextInt(101);
		System.out.println(Arrays.toString(n));
		for (int i=0; i<=4; i++) {
			int temp = n[i];
			n[i]=n[(n.length-1)-i];
			n[(n.length-1)-i]=temp;
		}
		System.out.println(Arrays.toString(n));
		
		
	}
}