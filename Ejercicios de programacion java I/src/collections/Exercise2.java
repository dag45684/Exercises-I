package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Exercise2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> first = new ArrayList<>();
		for (int i=0; i<100; i++) {
			first.add((int) Math.random()*100);
		}
		HashSet<Integer> second = new HashSet<>();
		second.addAll(first);
		TreeSet<Integer> third = new TreeSet<>();
		second.forEach(n -> third.add(n));

	}

}
