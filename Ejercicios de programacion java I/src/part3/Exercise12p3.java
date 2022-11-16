package part3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// c=center
//  


public class Exercise12p3 {
	public static void main(String[] args) throws IOException {
		
		//testing
//		int[] vec = {6, 2, 3, 0, 1};
		
		//main method
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input size");
		int[] vec = new int [Integer.parseInt(br.readLine())];
		for (int i=0; i<vec.length; i++) {
			System.out.println("input number");
			vec[i]=Integer.parseInt(br.readLine());
		}
		
		// external method
		System.out.println(center(vec) != null ? "Center at index "+center(vec) : "No center was found");
		
	
	}
	
	public static Integer center (int[] vec) {

		for (int c=1; c<vec.length; c++) { //skipping first and last position
			
			int resA = 0;
			for (int i=0; i<c; i++) {
				resA += ((c - i) * vec[i]);
			}
			
			int resB = 0;
			for (int j=c+1; j<vec.length; j++) {
				resB += ((j-c) * vec[j]);
			}
			if (resB == resA) return c; 
		}
		return null;
	}

}
