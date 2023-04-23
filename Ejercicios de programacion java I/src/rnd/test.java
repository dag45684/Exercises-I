package rnd;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
	
		ArrayList<Integer> n = new ArrayList<>();
		for (int i=0; i<10; i++) {
			int t = (int) (Math.random()*100)+1;
			if (t >= 10) {
				n.add(t);
			}
		}
		n.forEach(System.out::println);

	}
}
