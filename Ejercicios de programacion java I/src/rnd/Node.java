package rnd;

import java.util.*;

public class Node {
	
//	ArrayList <Tuple<Integer, String>> files = new ArrayList<Tuple<Integer, String>>();
	private String name;
	private ArrayList<Node> content = new ArrayList<Node>();
	private Node parent;
	private boolean isDir = false;
	private boolean hasDir = false;
	private int size;
	
	public Node (String name, Node parent) {
		this.name = name;
		this.parent = parent;
	}

	public void setName (String name) {this.name = name;}

	public void setParent (Node parent) {this.parent = parent;}

	public void setIsDir () {this.isDir = true;}

	public void setHasDir () {this.hasDir = true;}

	public String getName() {return this.name;}

	public ArrayList<Node> getContent() {return this.content;}

	public Node getParent() {return this.parent;}
	
	@Override
	public String toString () {
		String res = this.name + "  " + this.size + "Kb \n";
		if (this.hasDir) {
			for (int i=0; i<this.content.size(); i++) {
				res += this.content.get(i).getName() + '\n';
			}
		}
		return "a";
	}
	
	
	
	
}
