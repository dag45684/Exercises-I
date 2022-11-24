package rnd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RndHanoi {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		hanoi(n, 1, 2, 3);

	}
	
	public static void hanoi(int n, int Origin, int Auxiliar, int Destination) {
		if (n==1) {
			hanoi(n, Origin, Auxiliar, Destination);
			System.out.println("Moving disk "+n+" from Origin to Destination");
		}
		else {
			hanoi (n-1, Origin, Destination, Auxiliar);
			System.out.println("Moving disk "+(n-1)+" from Origin to Auxiliar");
			hanoi (n-1, Destination, Auxiliar, Origin);
			System.out.println("Moving disk "+(n-1)+" from Destination to Origin");
		}
	}

}
