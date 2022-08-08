package Seleniumpkg;

public class SplitString {
	public static void main(String[] args) {
		String s="My name is Sachin";
		
		String[] s1=s.split(" ");
		int L=s1.length;
		
		for(int i=0;i<L;i++) {
			System.out.println(s1[i]);
		}
	}
}
