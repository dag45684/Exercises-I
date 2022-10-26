package part2;

import java.util.Scanner;
import java.util.Vector;

public class Exercise18p2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Vector<Integer> alumns = new Vector<>();
		while (true) { // if we add as condition br.readline() == null, it will return a null when Ctrl+Z is pressed.
			System.out.print("Input alumn's age:");
			int temp = scanner.nextInt();
			if (temp<0) break;
			alumns.add(temp);
			
		}
		scanner.close();
		int sum=0;
		int age=alumns.size();
		for (int i=0; i<alumns.size(); i++) {
			if (alumns.elementAt(i)<18) age--;
			sum+=alumns.elementAt(i);
		}
		int med=sum/alumns.size();
		System.out.println("/nSum: "+sum);
		System.out.println("Median: "+med);
		System.out.println("Over 18yo: "+age);
	}
}
