package collections_submit;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Contacts {
	
	private Map<String, ArrayList<Integer>> cont = new TreeMap<>();
	
	Contacts(){}
	
	public void addTlf (String in) {
		try {
			String[] temp = in.split(":");
			Integer n = Integer.parseInt(temp[1]);
			if(!cont.containsKey(temp[0])) {
				cont.put(temp[0], new ArrayList<>());
				cont.get(temp[0]).add(n);
			}
			else {
				if(!cont.get(temp[0]).contains(n)) cont.get(temp[0]).add(n);
				else System.out.println("This number is already assigned to the contact");
			}
		}catch (NumberFormatException e) {
			System.out.println("Wrong number format, please retry");
		}
	}
	
	public void search (String in) {
		String[] temp = in.split(":");
		if(cont.containsKey(temp[1])) {
			System.out.println(cont.get(temp[1]).stream().map(Object::toString).collect(Collectors.joining(", ")));
		} else System.out.println("This contact does not exist.");
	}

	public void del (String in) {
		String[] temp = in.split(":");
		cont.remove(temp[1]);
	}
	
	public void showList() {
		System.out.println(cont.keySet());
	}
}
