package Seleniumpkg;

import java.util.Scanner;

public class Stringclass {
	public static void main(String[] args) {
		//*********** Check Value is Palindrome or not
		System.out.print("Please Enter a Value");
		Scanner s=new Scanner(System.in);
		String sk=s.next();
		String rev="";
		
		for (int i=sk.length()-1;i>=0;i--) {
			rev=rev+sk.charAt(i);
		}
		if(sk.equals(rev)) {
			System.out.println("Ye To Palindrome Tha yr");
		}
		else {
			System.out.println("Nahi yr");
			System.out.println("Hai Kya Ye Fir "+ rev);
		}
	}
}
