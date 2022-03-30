package com.corejava.interviewquestions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {
//Appraoch1
		FileReader file = new FileReader("..//interviewquestions//Selenium.txt");
		BufferedReader br = new BufferedReader(file);

		String str = "";
		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}
		br.close();

		// Approach2

		File f = new File("..//interviewquestions//Selenium.txt");
		Scanner s = new Scanner(f);

		while (s.hasNextLine()) {
			System.out.println(s.nextLine());

		}
		
		//Approach3
		File f1 = new File("..//interviewquestions//Selenium.txt");
		Scanner s1 = new Scanner(f);
		s1.useDelimiter("\\Z");
		System.out.println(s1.next());
	}

}
