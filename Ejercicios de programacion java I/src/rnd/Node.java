package rnd;

import java.util.*;

public class Node {
	
	String name;
//	ArrayList <Tuple<Integer, String>> files = new ArrayList<Tuple<Integer, String>>();
	ArrayList<Node> Dirs = new ArrayList<Node>();
	Node parent;
	int size;
	
	public Node (String name, Node parent) {
		this.name = name;
		this.parent = parent;
	}

	public String getName() {return name;}

	public ArrayList<Node> getContent() {return content;}

	public Node getParent() {return parent;}
	
	@Override
	public String toString () {
		String res = this.name + '\n';
		for (int i=0; i<this.content.size(); i++) {
			res += this.content.get(i).getName() + '\n';
		}
		
	}
	
	
	
	
}
