package collections_submit;

import java.util.Scanner;

public class MainEx6 {

	public static void main(String[] args) {
		
		Contacts list = new Contacts();
		Scanner s = new Scanner(System.in);
		String command = "";
		
		System.out.println("This is your contacts list\nFollowing commands apply:\nStr:number (To insert a phone with name = srt)\nSearch:Str (To look for a contact)\nDelete:Str (To delete an entry)\nContacts (to show all Names)\nExit");
		
		while (!command.equals("Exit")) {
			System.out.print("\n>");
			command = s.nextLine();
			if(command.contains("Search:")) {
				list.search(command);
			}
			else if(command.contains("Delete:")) {
				list.del(command);
			}
			else if (command.equals("Contacts")) {
				list.showList();
			}
			else if (command.contains(":") && command.charAt(0)!=':') {
				list.addTlf(command);
			}
			else if (!command.equals("Exit")) {
				System.out.println("Wrong command syntax, please retry.");		
			}
		}
	}
}
