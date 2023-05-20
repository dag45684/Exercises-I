package iofile;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test1 {

	public static void main(String[] args) throws IOException {
		readByBytes();
		writeInFile();
		readFromFile();
	}

	static void writeInFile() throws IOException {
		try (DataOutputStream out = new DataOutputStream(new FileOutputStream("C:\\Users\\Carlos\\Desktop\\test"))){
			out.writeUTF("hola1");
			out.writeBoolean(false);
			out.writeUTF("hola2");
		}
	}
	
	static void readFromFile() throws IOException{
		try (DataInputStream in = new DataInputStream(new FileInputStream("C:\\Users\\Carlos\\Desktop\\test"))){
			while (true) {
				try {
					System.out.println(in.readUTF());
				} catch (EOFException e) {
					break;
				}
			}
		}
	}
	
	static void readByBytes () throws IOException{
		try (InputStream in = Test1.class.getResourceAsStream("/lemario-general-del-espanol.txt")) {
			int data = in.read();
			while (data != -1) {
				data = in.read();
				System.out.println(data);
			}
		}
	}
}
