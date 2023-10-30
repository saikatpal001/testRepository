package practicejava;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Filetest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		FileWriter fw = new FileWriter("C:\\Users\\Saikat\\Desktop\\TestFile.txt");
		System.out.println("Enter the data");
		String str;
		while(!(str=br.readLine()).equalsIgnoreCase("exit")) {
			fw.append(str+"\n");
		}
		
		
		fw.close();
	}
		
		
}
