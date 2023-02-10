package collections;

import java.util.Scanner;
import java.util.Stack;

public class Exercise7p2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		for (int i=0; i<12; i++) {
			stack.add(s.nextInt());
		}
		s.close();
		stack = methodSolver(stack);
		System.out.println(stack);

	}
	
	public static Stack<Integer> methodSolver(Stack<Integer> stack){
		
		Stack<Integer> temp = new Stack<>();
		Stack<Integer> res = new Stack<>();
		temp.add(stack.pop());
		while (!stack.isEmpty()) {
			if (stack.peek() >= temp.peek()) temp.add(stack.pop());
			else stack.pop();
		}
		for (Integer i : temp) res.add(i);
		
		return res;
	}

	// I hated this exercise in great ammounts thank you

}
