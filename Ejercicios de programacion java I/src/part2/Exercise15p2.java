package part2;

public class Exercise15p2 {
	public static void main(String[] args) {
		
	double res=1;
	for (int i=1; i<100; i+=2) {
		res *= i;
		if (res<0) {
			System.out.println(i);
			break;
		}
	}
	System.out.println(res);
	}
}
