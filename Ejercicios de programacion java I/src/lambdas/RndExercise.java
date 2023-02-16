package lambdas;

import java.util.TreeMap;

public class RndExercise {

	static TreeMap<String, Integer> map = new TreeMap<>();
	
	public static void main(String[] args) {
		
		addrepeatedword("a");
		addrepeatedword("b");
		addrepeatedword("c");
		addrepeatedword("a");
		addrepeatedword("b");
		addrepeatedword("a");

		System.out.println(map);
		
		//Output = a:2 b:2 c:1

	}
	
	static void addrepeatedword(String p) {
		
		map.merge(p, 1, (possible_value, second_parameter) -> possible_value + second_parameter);
		//Christ knows how hard this was to understand for me
	}

}
