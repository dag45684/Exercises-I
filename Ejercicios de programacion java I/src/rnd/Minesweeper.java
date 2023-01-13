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
				clearArea (board, instruction, deadZones);
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
				board[i][j] = '_';
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
		String check = "" + row + col;
		
		for (int i=0; i<dead.length; i++) {
			if (check == dead[i]) {
				System.out.println("You step on a mine!");
				return true;
			}
		}
		return false;
	}
	
	static boolean checkMineSurr (int row, int col, String[] deadZones) {
		char a = (char) (row+65);
		char b = (char) col;
		String check = "" + row + col;
		for (int i=0; i<deadZones.length; i++) {
			if (check == deadZones[i]) {
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
	
	static void clearArea (char[][] board, String instruction, String[] deadZones) {
		int row = instruction.charAt(0) - 65; 
		int col = instruction.charAt(1) - 48;
		recFill (board, row, col, deadZones);

	}
	
	static void recFill (char[][] board, int row, int col, String[] deadZones) {
		int surr = 0;
		if ((row!=0 || row!=10) && (col!=0 || col!=10)) { if (checkMineSurr (row-1, col, deadZones)) surr++; };
		if ((row!=0 || row!=10) && (col!=0 || col!=10)) { if (checkMineSurr (row+1, col, deadZones)) surr++; };
		if ((row!=0 || row!=10) && (col!=0 || col!=10)) { if (checkMineSurr (row, col-1, deadZones)) surr++; };
		if ((row!=0 || row!=10) && (col!=0 || col!=10)) { if (checkMineSurr (row, col+1, deadZones)) surr++; };
		if ((row!=0 || row!=10) && (col!=0 || col!=10)) { if (checkMineSurr (row-1, col-1, deadZones)) surr++; };
		if ((row!=0 || row!=10) && (col!=0 || col!=10)) { if (checkMineSurr (row-1, col+1, deadZones)) surr++; };
		if ((row!=0 || row!=10) && (col!=0 || col!=10)) { if (checkMineSurr (row+1, col-1, deadZones)) surr++; };
		if ((row!=0 || row!=10) && (col!=0 || col!=10)) { if (checkMineSurr (row+1, col+1, deadZones)) surr++; };

		if (surr!=0) board[row][col] = String.valueOf(surr).charAt(0);
		else {
			recFill (board, row-1, col, deadZones);
			recFill (board, row+1, col, deadZones);
			recFill (board, row, col-1, deadZones);
			recFill (board, row, col+1, deadZones);
			recFill (board, row-1, col+1, deadZones);
			recFill (board, row-1, col-1, deadZones);
			recFill (board, row+1, col+1, deadZones);
			recFill (board, row+1, col-1, deadZones);
		}
		
		
	}
}
