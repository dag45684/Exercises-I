package part3;

import java.util.Arrays;

public class Exercise13p3 {

	static int randgen (int max, int min) {
		return (int)(Math.random()*(max-min))+min;
	}
	
	static int[] rowsum (int[][] nums) {
		int [] sum = new int[nums.length];
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[i].length; j++) {
				sum[i]+=nums[i][j];
			}
		}
		return sum;
	}
	
	static int[] colsum (int[][] nums) {
		int [] sum = new int[nums[0].length];
		for(int i=0; i<nums[0].length; i++) {
			for(int j=0; j<nums.length; j++) {
				sum[i]+=nums[j][i];
			}
		}
		return sum;
	}

	public static void main(String[] args) {

		int[][] nums = new int[randgen(20,2)][randgen(20,2)];
		for (int i = 0; i < nums.length; i++) {
			for (int j=0; j<nums[i].length; j++) {
				nums[i][j]=randgen(1,100);
			}
		}
		System.out.println("Sum of rows equals to " + Arrays.toString(rowsum(nums)));
		System.out.println("Sum of columns equals to " + Arrays.toString(colsum(nums)));
	}

}
