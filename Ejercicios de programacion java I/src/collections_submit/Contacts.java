package collections_submit;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Contacts {
	
	private Map<String, ArrayList<String>> cont = new TreeMap<>();
	
	Contacts(){}
	
	public void addTlf (String in) {
		String[] temp = in.split(":");
		
		if(!cont.containsKey(temp[0])) {
			cont.put(temp[0], new ArrayList<>());
			cont.get(temp[0]).add(temp[1]);
		}
		else {
			if(!cont.get(temp[0]).contains(temp[1])) {
				cont.get(temp[0]).add(temp[1]);
			}
			else {
				System.out.println("This number is already assigned to the contact");
			}
		}
	}
	
	public void search (String in) {
		String[] temp = in.split(":");
		if(cont.containsKey(temp[1])) {
			System.out.println(cont.get(temp[1])
					.stream()
					.map(Object::toString)
					.collect(Collectors.joining(", ")));
		} else {
			System.out.println("This contact does not exist.");
		}
	}

	public void del (String in) {
		String[] temp = in.split(":");
		cont.remove(temp[1]);
	}
	
	public void showList() {
		System.out.println(cont.keySet());
	}
}
