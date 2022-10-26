package part3;

import java.util.Arrays;

public class Exercise9p3 {

	public static void main(String[] args) {
		
		int[] nums = new int[(int)(Math.random()*490)+10];
		for (int i=0; i<nums.length; i++) {
			nums[i]=(int)(Math.random()*200)-100;
		}
		if (nums.length<=50) System.out.println(Arrays.toString(nums));
		int cnt=0;
		for(int i=0; i<nums.length; i++) {
			if(i!=nums.length-1) {
				if(nums[i]==nums[i+1]) {
					cnt++;
					int temp = nums[i];
					while (nums[i]==temp) i++;
					i--;
				}
			}
		}
		System.out.println("Sequences: "+cnt);
	

	}

}
