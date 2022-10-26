package part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Arrays;


public class Exercise31p2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] data = new String[10];
        boolean size = true;
        for (int i=0; i<10; i++){
            do {
            String temp = br.readLine();
            if (!(temp.length()<=50)) {
                size=false;
                System.out.println("Too long. Max 50char.");
            }
            else data[i]=temp;
            } while (!size);
            System.out.println("Succesfuly saved.");
        }
        Arrays.sort(data, Comparator.comparingInt(String::length));
        for (int i=0; i<10; i++) System.out.println(data[i]);
    }

}
