package day29exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//How to read a text file line by line

public class Exception03 {

	public static void main(String[] args) {
		readTextFileLineByLine();
	}
	public static void readTextFileLineByLine() {
		try {
			@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(new FileReader("src/day28exceptions/TextFile01"));
			String Line = br.readLine();
			while(Line!=null) {
				System.out.println(Line);
				Line = br.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Path is wrong or the file does not exist");
		} catch (IOException e) {
				System.out.println("For some reason the file cannot be read");
			}
	}
}
