package rnd;

public class BitwPair {

	public static void main(String[] args) {
		System.out.println(isp(1));
		System.out.println(isp(2));
		System.out.println(isp(3));
		System.out.println(isp(4));
		System.out.println(isp(5));
		System.out.println(isp(6));
		System.out.println(isp(7));
	}
	
	public static boolean isp (int n) {
		return (n & 1) == 0;
	}

}
