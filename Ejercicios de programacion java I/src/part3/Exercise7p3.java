package part3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Exercise7p3 {
	
	public static boolean repeat(int n, int[] nums) {
		for (int i : nums) if (n==i) return true;
		return false;
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input vector size:");
		int[] nums = new int[Integer.parseInt(br.readLine())];
		
		int max=0;
		int min=0;
		for (int i=0; i<nums.length; i++) {
			boolean ok=false;
			do {
				int temp=(int)(Math.random()*2000000)-1000000;
				if(!repeat(temp,nums)) {
					nums[i]=temp;
					if (nums[i]>max)max=nums[i];
					if (nums[i]<min)min=nums[i];
					ok=true;
				}
			}while(!ok);
		} //TODO: need to avoid repeating numbers with a method
		System.out.println(Arrays.toString(nums));	
		System.out.println("Vector size:" + nums.length);
		System.out.println("Difference:"+(max-min));
		System.out.println("max "+max);
		System.out.println("min "+min);
		
	}

}
