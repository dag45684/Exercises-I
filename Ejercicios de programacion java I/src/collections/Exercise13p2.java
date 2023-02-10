package collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Exercise13p2 {

	public static void main(String[] args) {
		
		Deque<Integer> stack = new ArrayDeque<>();
		Scanner s = new Scanner(System.in);
		for (int i=0; i<5; i++) {
			stack.push(s.nextInt());
		}
		collapse(stack);
		System.out.println(stack);

	}
	
	static void collapse (Deque<Integer> stack) {
		
		Deque<Integer> temp = new ArrayDeque<>();
		while (!stack.isEmpty()) {
			int n = stack.pop();
			int m=0;
			try {
				m = stack.pop();
			}catch (NoSuchElementException e) {}
			temp.push(n+m);
		}
		
		temp.forEach(n -> stack.add(n));
		
	}

}
