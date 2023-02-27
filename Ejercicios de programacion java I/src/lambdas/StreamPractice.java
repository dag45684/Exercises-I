package lambdas;

import java.util.List;

public class StreamPractice {

	public static void main(String[] args) {
		
		List<String> l = List.of("a", "b", "c", "d");
		List<String> k = List.of("a", "bb", "ccc", "dddd", "eeeee");
//		List<String> L = List.of(l.stream().forEach(String::toUpperCase)); cant get this to work
		
		l.stream().map(String::toUpperCase).forEach(System.out::println);
		
		k.stream().map(String::toUpperCase)
			.filter(s -> s.length() % 2 != 0)
			.forEach(System.out::println);
		
//		ArrayList<Integer> n = Arrays.stream().filter(i -> i++<20).forEach(i -> n.add(i)); 

	}

}
