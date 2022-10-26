package part1;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class Exercise14p1 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.print("First number:");
		int x=scanner.nextInt();
		System.out.print("Second number:");
		int y=scanner.nextInt();
		scanner.close();
		System.out.println("result:" + (y+x));
	}

}

//BufferedReader reader = new BufferedReader (new InputStreamReader(System.in)); //Console input reader
//double a=Integer.parseInt(reader.readLine());
//double b=Integer.parseInt(reader.readLine());
//System.out.println(a+b);
