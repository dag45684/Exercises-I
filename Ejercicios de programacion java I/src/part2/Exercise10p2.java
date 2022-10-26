package part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise10p2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Insert A:");
		int a=Integer.parseInt(br.readLine());
		System.out.println("Insert B:");
		int b=Integer.parseInt(br.readLine());
		System.out.println("Insert C:");
		int c=Integer.parseInt(br.readLine());
		
		double x1 = (double) (((b*-1) + Math.sqrt(Math.pow(b, 2) - (4*a*c))) / 2*a);
		double x2 = (double) (((b*-1) - Math.sqrt(Math.pow(b, 2) - (4*a*c))) / 2*a);
		
		System.out.println("\nResults are:\n"+x1+"\n"+x2);

	//TODO: doesnt work i hate math i hate it so fucking much	
		
	}
}
