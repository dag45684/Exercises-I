package part3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise8p3 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean ok=false;
		int size=0;
		System.out.println("Input vector size:");
		do {
			try {
				size=Integer.parseInt(br.readLine());
				if (size>=10 && size<=200) {
					ok=true;
				}
				else {
					System.out.println("range number only between 10 and 200");
				}
			}
			catch(NumberFormatException | IOException e){
				System.out.println("You must imput a number");
			}
		}while (!ok);
		int[] nums = new int[size];
		for (int i=0; i<nums.length; i++) {
			nums[i] = (int)(Math.random()*200)-100;
		}
		int res=0;
		for (int i=0; i<nums.length; i++) {
			if (nums[i]!=13) res+=nums[i];
			else {
				int temp=0;
				for(int j=0; j<13; j++) {
					temp+=nums[i+j];
				}
				if (temp!=7) {
					i+=13;
					size-=13;	
				}
				else res+=temp;
			}
		}
		System.out.println("Vector sum = "+res);
		System.out.println("Unsummed numbers"+(nums.length-size));
	}

}
