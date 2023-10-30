package practicejava;

import java.util.Scanner;

public class practicejava {

	public static void main(String[] args) {

		System.out.print("Enter a string : ");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		// Method #1
		/*
		 * String S2=""; String[] strlst = inputString.split(" ");
		 * 
		 * for(int j=0; j<strlst.length;j++) {
		 * 
		 * char[] arr= strlst[j].toCharArray();
		 * 
		 * String S1 = ""; for(int i=arr.length-1; i>=0; i--)
		 * 
		 * 
		 * {S1=S1+arr[i];
		 * 
		 * 
		 * } if(j==0) { S2=S2+S1;} else S2=S2+" "+S1;
		 * 
		 * } System.out.println(S2);
		 */

		// Method 2
		/*
		 * String S1=""; String S2=""; String[] strlst = inputString.split(" "); for(int
		 * j=0; j<strlst.length;j++) { StringBuilder sb=new StringBuilder(strlst[j]);
		 * S1=sb.reverse().toString(); if(j==0) { S2=S2+S1;} else S2=S2+" "+S1; }
		 * System.out.println(S2);
		 * 
		 */ }
}
