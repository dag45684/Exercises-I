package exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Exercise3 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Input three numbers");
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		double a = Double.parseDouble(br.readLine());
		double b = Double.parseDouble(br.readLine());
		double c = Double.parseDouble(br.readLine());
		
		System.out.println("Results are: " + Arrays.toString(solve(a,b,c)));
	}

	public static double[] solve (double a, double b, double c) {
		
		if (Math.max(a, Math.max(b, c)) == 0) throw new IllegalArgumentException("Not 2nd grade ecuation");
		
		double d = Math.sqrt((b*b) - ((4*a) * c));
		if (Double.isNaN(d)) throw new ArithmeticException("No solution");

		double[] res = new double[2];
		res[0] = (-b + d) / (2*a);
		res[1] = (-b - d) / (2*a);
			
		return res;
	}
}
