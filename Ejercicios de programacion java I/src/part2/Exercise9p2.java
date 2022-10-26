package part2;

import java.util.Scanner;

public class Exercise9p2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input your math exam grade: ");
		float tmath=scanner.nextFloat();
		System.out.println("Input your math average exercise grade: "); 
		float emath=scanner.nextFloat();
		System.out.println("Input your phisics exam grade: ");
		float tphi=scanner.nextFloat();
		System.out.println("Input your phisics average exercise grade: "); 
		float ephi=scanner.nextFloat();
		System.out.println("Input your chemistry exam grade: ");
		float tchem=scanner.nextFloat();
		System.out.println("Input your chemistry average exercise grade: "); 
		float echem=scanner.nextFloat();
		scanner.close();
		
		float resmath = 0.9f*tmath + 0.1f*emath;
		float resphi = 0.9f*tphi + 0.2f*ephi;
		float reschem = 0.85f*tchem + 0.15f*echem;
		
		System.out.println("Your grades in math are :" + resmath);
		System.out.println("Your grades in phisics are :" + resphi);
		System.out.println("Your grades in chemistry are :" + reschem);
	}
}
