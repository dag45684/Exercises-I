package part3;

import java.util.Arrays;

public class Exercise18p3 {

	public static void main(String[] args) {
		
		int[][] first = squared();
		for (int[] x : first) System.out.println(Arrays.toString(x));
		System.out.println();
		int[][] second = squaredinv();
		for (int[] x : second) System.out.println(Arrays.toString(x));
		System.out.println();
		String[][] third = pal(3,4);
		for (String[] x : third) System.out.println(Arrays.toString(x));
	}
	
	static int[][] squared () {
		int[][] x = new int [3][3];
		int val = 0;
		for (int i=0 ; i < x.length ; i++) {
			for (int j=0 ; j<x[i].length ; j++) {
				x[j][i]=val;
				val++;
			}
		}
		return x;
	}
	
	static int[][] squaredinv (){
		int[][] x = new int [3][3];
		int val = 0;
		for (int i=0 ; i < x.length ; i++) {
			if (i%2==0) {
				for (int j=0 ; j<x[i].length ; j++) {
					x[j][i]=val;
					val++;
				}
			}
			else {
				for (int j=x[i].length-1 ; j>=0; j--) {
					x[j][i]=val;
					val++;
				}
			}
		}
		return x;
	}
	
	static String[][] pal (int a, int b){
		String [][] x = new String[a][b];
		String s = "abdcefghijklmnopqrstuvwxyz";
		for (int i=0; i<a; i++) {
			for (int j=0; j<b; j++) {
				String temp = "";
				temp = temp + s.charAt(i);
				temp = temp + s.charAt(i+j);
				temp = temp + s.charAt(i);
				x[i][j]=temp;
			}
		}
		
		return x;
	}
	
	

}
