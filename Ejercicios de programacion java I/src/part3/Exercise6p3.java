package part3;

import java.util.Arrays;

public class Exercise6p3 {

	public static void main(String[] args) {
		
		int[] nums = new int[(int)(Math.random()*(50-10)+10)];
		for (int i=0; i<nums.length; i++) {
			nums[i] = (int) (Math.random()*200)-100;
		}
		int[] inv = new int[nums.length];
		for(int i=0; i<nums.length; i++) {
			inv[i]=nums[(nums.length-i)-1];
		}
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(inv));

	}

}
