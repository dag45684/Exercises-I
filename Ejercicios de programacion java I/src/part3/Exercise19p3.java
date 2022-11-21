package part3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise19p3 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String[] sizes = br.readLine().split(" ");
		int rows = Integer.parseInt(sizes[0]);
		int columns = Integer.parseInt(sizes[1]);
		char [][] v = new char [rows][columns];
		for (int i=0; i<rows; i++) {
			insert(v[i], br.readLine());
		}
		print(v);
		char in = br.readLine().charAt(0);
		int rowinit = Integer.parseInt(br.readLine());
		int colinit = Integer.parseInt(br.readLine());
		fill (v, rowinit, colinit, in);
		print(v);
	}
	
	public static void insert (char [] rows, String data) {
		for (int i=0; i<rows.length; i++) {
			rows[i] = data.charAt(i);
		}
	}
	
	public static void print(char[][] v) {
		System.out.println();
		for (char[] x : v) System.out.println(x);
	}
	
	public static void fill (char[][] v, int rowinit, int colinit, char in) {
		char rn = v[rowinit][colinit];
		v[rowinit][colinit] = in;
		if (rowinit-1 >= 0 && v[rowinit-1][colinit] == rn) fill (v, rowinit-1, colinit, in);
		if (rowinit+1 < v.length && v[rowinit+1][colinit] == rn) fill (v, rowinit+1, colinit, in);
		if (colinit-1 >= 0 && v[rowinit][colinit-1] == rn) fill (v, rowinit, colinit-1, in);
		if (colinit+1 < v.length && v[rowinit][colinit+1] == rn) fill (v, rowinit, colinit+1, in);
	}

}
