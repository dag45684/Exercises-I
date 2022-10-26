package part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise22p2 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int target = Integer.parseInt(br.readLine());
		if (target==0)System.out.println(target);
		else {
			int n1=0;
			int n2=1;
			int res=1;

			for (int i=0; i<target-1; i++) {
				res=n1+n2;
				n1=n2;
				n2=res;
			}
			System.out.println(res);
		}	
		
	}

}
