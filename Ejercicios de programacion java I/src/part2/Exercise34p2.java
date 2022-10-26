package part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise34p2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String data = br.readLine();
		boolean res=true;
		for (int i=0; i<data.length()/2; i++) {
			if (!(data.charAt(i)==data.charAt((data.length()-1)-i))) {
				res=false;
				break;
			}
		}
		System.out.println(res==true?"Palindrome":"Non palindrome");

	}

}
