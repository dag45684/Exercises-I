package collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Exercise5 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Write three numbers in row");
		String[] rowone = br.readLine().split(" ");
		int N = Integer.parseInt(rowone[0]);
		int K = Integer.parseInt(rowone[1]);
		int X = Integer.parseInt(rowone[2]);
		List<String> n = Arrays.asList(br.readLine().split(" "));
		if (!n.contains(Integer.toString(X))) n.add((int)(Math.random()*n.size()), Integer.toString(X));
		Queue<Integer> q = new PriorityQueue<Integer>();
		for (int i=0; i<N; i++) {
			q.offer(Integer.parseInt(n.get(i)));
		}
		for (int i=0; i<K; i++) {
			q.poll();
		}
		if(q.contains(X)) System.out.println(true);
		else if (!q.isEmpty()) {
			int max=0;
			for (Integer i : q) if (i>max) max=i;
			System.out.println(max);
		}
		else System.out.println(0);
	}

}
