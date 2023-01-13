package oop1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MoneyBox {
	
	private int one;
	private int two;
	private int five;
	private int ten;
	private int twenty;
	private int fifty;
	private String password;
	private boolean open;

	public MoneyBox() { 
		this.password = "password";
		this.open = false;
	}
	
	public MoneyBox(int one, int two, int five, int ten, int twenty, int fifty) {
		this.one = one;	
		this.two = two;	
		this.five = five;	
		this.ten = ten;	
		this.twenty = twenty;	
		this.fifty = fifty;	
		this.password = "password";
		this.open = false;
	}
	
	public MoneyBox (int n) {
		if (n >= 50) {
			this.fifty = n / 50;
			n = n % 50;
		}
		if (n >= 20) {
			this.twenty = n / 20;
			n = n % 20;
		}
		if (n >= 10) {
			this.ten = n / 10;
			n = n % 10;
		}
		if (n >= 5) {
			this.five = n / 5;
			n = n % 5;
		}
		if (n >= 2) {
			this.two = n / 2;
			n = n % 2;
		}
		if (n >= 1) {
			this.one = n / 1;
		}
		this.password = "password";
		this.open = false;
	}
	
	public void setPassword (String password) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter current password to change it.\n >");
		String att = br.readLine();
		if (this.password.equals(att)) {
			this.password = password;
		}
		else System.out.println("Wrong password!");
	}
	
	public void openBox () throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter password to open the box \n >");
		String password = br.readLine();
		if (this.password.equals(password)) this.open = true;
		else System.out.println("Wrong password!");
	}
	
	public void closeBox() { this.open = false;	}
	
	public void addMoney (int n){
		if (open) {
			if (n >= 50) {
				this.fifty += n / 50;
				n = n % 50;
			}
			if (n >= 20) {
				this.twenty += n / 20;
				n = n % 20;
			}
			if (n >= 10) {
				this.ten += n / 10;
				n = n % 10;
			}
			if (n >= 5) {
				this.five += n / 5;
				n = n % 5;
			}
			if (n >= 2) {
				this.two += n / 2;
				n = n % 2;
			}
			if (n >= 1) {
				this.one += n / 1;
			}
			System.out.println("Done!");
		}
		else System.out.println("Box is closed!");
	}

	public void withdrawMoney (int one, int two, int five, int ten, int twenty, int fifty) {
		if (open) {
			this.one -= one;	
			this.two -= two;	
			this.five -= five;	
			this.ten -= ten;	
			this.twenty -= twenty;	
			this.fifty -= fifty;	
		}
	}
	
	public void withdrawMoney (int n) {
		if (open) {
			int temp = n/50;
			if (temp > 0) {
				this.fifty -= temp;
				n -= temp*50;
				temp = n/20;
			}
			if (temp > 0) {
				this.twenty -= temp;
				n -= temp*20;
				temp = n/10;
			}
			if (temp > 0) {
				this.ten -= temp;
				n -= temp*10;
				temp = n/5;
			}
			if (temp > 0) {
				this.five -= temp;
				n -= temp*5;
				temp = n/2;
			}
			if (temp > 0) {
				this.two -= temp;
				n -= temp*2;
				temp = n/1;
			}
			if (temp > 0) {
				this.twenty -= temp;
			}
			System.out.println("Done!");
		}
		else System.out.println("Box is closed!");
	}
	
	public void getCoins () {
		System.out.println("Through the glass lid you can see " + (this.one+this.two) + " coins with a value of " + (this.one + (this.two * 2)));
	}
	public void getBills () {
		System.out.println("Through the glass lid you can see " + (this.five+this.ten+this.twenty+this.fifty) + " bills with a value of " + ((this.five*5) + (this.ten * 10) + (this.twenty * 20) + (this.fifty * 50)));
	}
	public void getValue () {
		System.out.println("you can guess there's " + (this.one+(this.two*2)+(this.five*5)+(this.ten*10)+(this.twenty*20)+(this.fifty*50)));
	}
}



