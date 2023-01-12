package rnd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Minesweeper {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		System.out.println("Number of mines:");
		int mines = Integer.parseInt(br.readLine());
		char[][] board = genBoard();
		String[] deadZones = placeMines(mines, board);
		
		boolean gameOver = false;
		int points = 0;
		while (!gameOver) {
			printBoard(board);
			System.out.println("Input Row and Column: \n >");
			String instruction = br.readLine();
			if (checkMine(instruction, deadZones)) {
				gameOver = true;
			}
			else {
				points++;
				clearPlace(board, instruction);
			}
			if (points == 100-mines) {
				System.out.println("You dodged all mines!");
				gameOver = true;
			}
		}
		System.out.println("You scored " + points + " points!");
	}
	
	
	static void printBoard (char[][] board) {
		char row = 'A';
		char[] column = {'0','1','2','3','4','5','6','7','8','9'};
		System.out.println("   " + Arrays.toString(column));
		System.out.println();
		for (char[] x : board) {
			System.out.println(row + "  " + Arrays.toString(x));
			row++;
		}
	}

	static char[][] genBoard (){
		char[][] board = new char[10][10];
		for (int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
				board[i][j] = ' ';
			}
		}
		return board;
	}
	
	static String[] placeMines (int mines, char[][] board) {
		String[] res = new String[mines];
		for (int i=0; i<mines; i++) {
			int rnd = (int) Math.random() * 100;
			res[i] = String.valueOf(rnd/100) + String.valueOf(rnd%100);
		}
		return res;
	}
	
	static boolean checkMine (String instruction, String[] dead) {
		char row = String.valueOf(instruction.charAt(0) - 65).charAt(0); 
		char col = String.valueOf(Integer.valueOf(instruction.charAt(1))).charAt(0);
		System.out.println(row);
		System.out.println(col);
		String check = "" + row + col;
		
		for (int i=0; i<dead.length; i++) {
			if (check == dead[0]) {
				System.out.println("You step on a mine!");
				return true;
			}
		}
		return false;
	}
	
	static void clearPlace (char[][] board, String instruction) {
		int row = instruction.charAt(0) - 65; 
		int col = instruction.charAt(1) - 48;
		
		board[row][col] = 'X';
	}
}
