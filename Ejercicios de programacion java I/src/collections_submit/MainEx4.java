package collections_submit;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MainEx4 {

	public static void main(String[] args) {

		Words eng = new Words();
		Scanner s = new Scanner(System.in);
		String command = "";
		
		System.out.println("This is an English word storage.\nFollowing commands Apply:\n\nAdd: str str... (adds str)\nList n (show all words with length n)\nDelall (delete all)\nDel: str str... (deletes all words and adds str into it)\nExit\n");
		
		while (!command.equals("Exit")) {
			System.out.print(">");
			command = s.nextLine();
			if (command.contains("Add: ")) {
				if (command.substring(4).contains(" ")) {
					eng.addWordsBySentence(command.substring(5));
				}
				else {
					eng.addWord(command.substring(5));
				}
			}
			else if (command.contains("List ")) {
				try {
					int n = Integer.parseInt(command.substring(5));
					eng.checkWithLen(n).forEach(System.out::println);
				} catch (NumberFormatException e) {
					System.out.println("Wrong format number, please retry");
				}
			}
			else if(command.contains("Delall")) {
				eng.delall();
			}
			else if(command.contains("Del: ")) {
				eng.delall();
				if (command.substring(4).contains(" ")) {
					eng.addWordsBySentence(command.substring(5));
				}
				else {
					eng.addWord(command.substring(5));
				}
			}
			else if (!command.equals("Exit")) {
				System.out.println("Wrong command syntax, please retry.");
			}
		}
	}
}
