package rnd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day7 {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream input = new FileInputStream("C:\\Users\\TardeDAM\\DAM Temario\\done\\input.txt");
		Scanner scanner = new Scanner (input);
		ArrayList<String> data = new ArrayList<String>();
		while (scanner.hasNextLine()) data.add(scanner.nextLine());
		// Parsing
		
		Node root = new Node("/");
		Node current = root;
		current.setIsDir();
		for(int i=0; i<data.size(); i++) {
			if (data.get(i).contains("$")){
				switch (data.get(i).substring(1, 4)) {
				case "cd":
					if (data.get(i).contains("..")){
						current = current.getParent();
					}
					else { 
						current.setIsDir();
						Node creation = new Node(data.get(i).substring(5),current);
						current.getContent().add(creation);
						current = creation;
						current.setIsDir();
						break;
					}
				case "ls": break;
				}
			}
			else {
				if (!data.get(i).contains("dir")) {
					int blank = data.get(i).indexOf(" ");
					int size = Integer.parseInt(data.get(i).substring(0, blank));
					current.getContent().add(new Node(data.get(i).substring(blank+1), size));
				}
			}
		}
		Node.dirSizeCalc(root);
		System.out.println(root.toString());
	}

}
