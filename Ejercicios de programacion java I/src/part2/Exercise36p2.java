package part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

//TODO: Fucking java doesnt know when to stop parsing charat and need to be specified IF (charat)
// nightmare

public class Exercise36p2 {

	public static void main(String[] args) throws IOException {
		
		String[] dataset = {"Password123", "Ihatejava", "123456", "BruhMomentDetected"};
		Random rnd = new Random();
		int n = rnd.nextInt(4-0)+1;
		String res=dataset[n];		
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String backup="_______________";
		while (true) {
			System.out.println("Input your guess:");
			String guess = br.readLine();
			if (guess==res)break;
			String response="";
			for (int i=0; i<guess.length(); i++) {
				if(guess.charAt(i)==res.charAt(i) && backup.charAt(i)=='_') response+=guess.charAt(i);
				if(backup.charAt(i)!='_') response+=backup.charAt(i);
				else response+='_';
				}
			System.out.println(response);
			backup=response;
		}
		System.out.println("Correct");

	}

}
