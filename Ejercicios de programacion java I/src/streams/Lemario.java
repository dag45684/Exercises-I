package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Lemario {

	public static void main(String[] args) throws IOException {
		
		List<String> lemario;
		
		lemario = Files.readAllLines(
					Paths.get("resources", "lemario-general-del-espanol.txt"));
		
		//1.Show in console all words starting by letters
		// 	from a to m.

//		lemario.stream().filter(n -> n.matches("[a-m].*")).forEach(System.out::println);
		
		//2.Group words that begin with the same three characters when length over 3
		
		Map<String, ArrayList<String>> gr = new HashMap<>();
//		lemario.forEach(n -> {
//			if (n.length() > 3 && !gr.containsKey(n.substring(0, 3))) {
//				gr.put(n.substring(0, 3), new ArrayList<>());
//			}			
//			gr.get(n.substring(0, 3)).add(n);
//			
//		});
//		gr.forEach((k, v) -> System.out.println(k + " " + v));
		
//		Map <String, List<String>> res;
//		res = lemario.stream()
//				.filter(e -> e.length()>3)
//				.collect(Collectors.groupingBy(e -> e.substring(0, 3)));
//		res.forEach((k, v) -> System.out.println(k + " " + v));
		
		//3. Find palyndromes and store them in a list
		List<String> pal;
		pal = lemario.stream().filter(n -> n.equals(new StringBuilder(n).reverse().toString())).toList();
		pal.forEach(System.out::println);
		
		//4. count the number of words that each letter appears in
		
		
//		lemario.stream().
		
	}

}
