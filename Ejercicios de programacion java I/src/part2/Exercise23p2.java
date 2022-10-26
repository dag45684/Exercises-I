package part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise23p2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("First position (X,Y)");
		int x1=Integer.parseInt(br.readLine());
		int y1=Integer.parseInt(br.readLine());
		System.out.println("Second position (X,Y)");
		int x2=Integer.parseInt(br.readLine());
		int y2=Integer.parseInt(br.readLine());
		
		double res = Math.sqrt( (Math.pow((y2-y1), 2)) + (Math.pow((x2-x1),2)) );
		System.out.println(res);
		
	}
}
