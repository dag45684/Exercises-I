package collections_submit;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Words {
	
	private Set<String> cont = new TreeSet<>();

	Words(){}
	
	Words(String in){
		String[] temp = in.split(" ");
		for (String s : temp) cont.add(s);		
	}
	
	//Since the addWordsBySentence works just fine with just a single word
	//this method is bloated and i'd avoid using it, however, it is
	//required by the exercise
	public void addWord (String in) {
			cont.add(in);
	}
	
	public void addWordsBySentence (String in) {
		String[] temp = in.split(" ");
		for (String s : temp) cont.add(s);		
	}
	
	public boolean checkEntry (String in) {
		return cont.contains(in);
	}
	
	public List<String> checkWithLen (int n) {
		List<String> res;
		res = cont.stream().filter(s -> s.length()==n).toList();
		return res;
	}
	
	public void delall () {
		cont.clear();
	}
	
}
