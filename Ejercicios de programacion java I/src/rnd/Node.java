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
	
	public Node (String name) {
		this.name = name;
	}
	public Node (String name, Node parent) {
		this.name = name;
		this.parent = parent;
	}
	public Node (String name, int size) {
		this.name = name;
		this.size = size;
	}

	public void setName (String name) {this.name = name;}

	public void setParent (Node parent) {this.parent = parent;}

	public void setSize (int size) {this.size = size;}

	public void setIsDir () {this.isDir = true;}

	public void setHasDir () {this.hasDir = true;}

	public boolean getIsDir () {return this.isDir;}

	public boolean getHasDir () {return this.hasDir;}

	public String getName() {return this.name;}

	public int getSize() {return this.size;}

	public ArrayList<Node> getContent() {return this.content;}

	public Node getParent() {return this.parent;}
	
	@Override
	public String toString () {
		String res = this.name + "  " + this.size + "Kb \n";
		for (int i=0; i<this.content.size(); i++) {
			if(this.content.get(i).isDir) {
				res += this.content.get(i).toString();
			}
			else res += "-----" + this.content.get(i).getName() + "  " + this.content.get(i).getSize() + "Kb \n";
		}
		return res;
	}
	
	public static int dirSizeCalc(Node node) {
		int res = 0;
		for (int i=0; i<node.getContent().size(); i++) {
			if (node.getContent().get(i).getIsDir()) {
				dirSizeCalc(node);
			}
			else {
				res += node.getSize();
			}
		}
		node.setSize(res);
		return node.getSize();
	}
	
	
	
	
}
