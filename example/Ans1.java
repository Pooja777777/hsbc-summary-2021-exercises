package com.example;

import java.util.Scanner;

public class Ans1 
{
	public static void main(String[] args)
	{
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter a Alphabet");
		char c=sn.next().charAt(0);
		checkAlphabet(c);
	}  
	public static void checkAlphabet(char c)
	{
		if(c>='A' && c<='Z' || c<='a' && c<='z')
		{
			System.out.println(c +" is an alphabet");
		}
	}
}
