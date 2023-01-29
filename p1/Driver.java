package com.gl.p1;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		BalanceBracket checkBalance=new BalanceBracket();
		
		System.out.println("Enter the brackets to check wether they are balanced or unbalanced:");
		String str=sc.nextLine();
		
		boolean result;
		result=BalanceBracket.checkBalanced(str);
		
		if(result)
			System.out.println("The entered string is balanced brackets");
		else
			System.out.println("The entired string do not contain Balanced bracket");
		
		sc.close();

	}

}
