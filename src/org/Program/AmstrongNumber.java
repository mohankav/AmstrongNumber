package org.Program;

import java.util.Scanner;

public class AmstrongNumber {

	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int digit=0, rem=0,res=0;
		
		while (n>0) {
			n=n/10;
			digit++;
		}
		
		System.out.println("the count of digit is "+digit);
		
		while (n>0) {
			rem =n%10;
			res=(int)(res+Math.pow(rem, digit));
			n=n/10;
		}
		
		if (n==res) {
			System.out.println("Amstrong number");
		} else {
			System.out.println("Non Amstrong Number ");
		}
		
	}
}
