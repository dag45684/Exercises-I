package part2;

import java.util.Arrays;

public class Exercise27p2 {
	
	static boolean Prime(int n) {
		for (int i=2; i<=(n/2); i++) if (n%i==0) return false;		
		return true;
	}
	
	public static void main(String[] args) {

		int[] res = new int[20];
		int cnt=0;
		for (int i=2; res[19]==0; i++) {
			if (Prime(i)) {
				res[cnt]=i;
				cnt++;
			}
		}
		System.out.println(Arrays.toString(res));
	}

}
