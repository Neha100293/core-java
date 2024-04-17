package com.corejava.io;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub	
		File  file= new File("D:\\java coding\\javaCore\\abc.txt");
		System.out.println(file.exists());
		 file.createNewFile();
		
	}

}
