package com.corejava.interviewquestions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDatatoTextFile {

	public static void main(String[] args) throws IOException {
		FileWriter f=new FileWriter("..//interviewquestions//SeleniumWrite.txt");
		
		BufferedWriter bw=new BufferedWriter(f);
		bw.write("Selenium with Java"+"\n");
		
		bw.write("Selenium with C#"+"\n");
		bw.write("Selenium with Python"+"\n");
		System.out.println("Finished");
		bw.close();
		

	}

}
