package part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise29p2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		int[][] res =  new int[n][m];
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				res[i][j]=i+j;
			}
		}
		
		for (int i=0; i<n; i++) {
			System.out.println();
			for (int j=0; j<m; j++) System.out.print(res[i][j] + "   ");		
		}
		
	}

}
