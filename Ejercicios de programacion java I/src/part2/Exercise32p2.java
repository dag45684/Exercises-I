package part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise32p2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input a sentence");
        String data = br.readLine().toLowerCase();
        for (int i=0; i<data.length(); i++){
            switch (data.charAt(i)){
                case 'a':
                    System.out.println("A at character " + i);
                    break;
                case 'e':
                    System.out.println("E at character " + i);
                    break;
                case 'i':
                    System.out.println("I at character " + i);
                    break;
                case 'o':
                    System.out.println("O at character " + i);
                    break;
                case 'u':
                    System.out.println("U at character " + i);
                    break;
                default:
                    break;
            }
        }
    }
}