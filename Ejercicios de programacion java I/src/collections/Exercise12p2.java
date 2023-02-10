package collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Exercise12p2 {

	public static void main(String[] args) {
		
		Deque<Integer> stack = new ArrayDeque<>();
		Scanner s = new Scanner(System.in);
		for (int i=0; i<5; i++) {
			stack.push(s.nextInt());
		}
		duplicate(stack);
		System.out.println(stack);

	}
	
	static void duplicate(Deque<Integer> stack) {
		Deque<Integer> temp = new ArrayDeque<Integer>();
		while (!stack.isEmpty()) {
			temp.push(stack.peek());
			temp.push(stack.pop());
		}
		temp.forEach(n -> temp.push(n));
	}

}
