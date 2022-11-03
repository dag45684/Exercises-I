package rnd;

import java.util.Arrays;

public class ExerciseSorting2 {

	public static void main(String[] args) {
		int [] nums = new int[100];
		for (int i=0; i<100; i++) nums[i]=(int)(Math.random()*100);
		System.out.println(Arrays.toString(nums));
		//sorting
		
		for (int i=0; i<nums.length; i++) {
			int next=0;
			int index=0;
			for (int j=i; j<nums.length; j++) {
				if (nums[j]<next) {
					next=nums[j]; 
					index=j;
				}
			}
			if (next<nums[i]) {
				int temp = nums[i];
				nums[i]=next;
				for (int x=i+1; x<index; x++) {
					int aux=nums[x];
					nums[x]=temp;
					temp=aux;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
	}

}

//		int [] nums = new int[100];
//		for (int i=0; i<100; i++) nums[i]=(int)(Math.random()*100);
//		System.out.println(Arrays.toString(nums));
//		//sorting
//		boolean ok=false;
//		while (!ok) {
//			for (int i=nums.length-1; i>0; i--) {
//				if (nums[i]<nums[i-1]) {
//					int aux = nums[i];
//					nums[i]=nums[i-1];
//					nums[i-1]=aux;
//				}
//			}
//			for (int i=1; i<nums.length; i++) {
//				if(nums[i]<nums[i-1]) i=nums.length; //how wonderful a break instruction would be in this for loop
//				if (i==nums.length-1) ok=true;
//			}
//		}
//		System.out.println(Arrays.toString(nums));
//