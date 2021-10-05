package com.example;

import java.util.Scanner;

public class Ans3 {
	public static void main(String[] args)
	{
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sn.nextInt();
		System.out.println("Enter second number");
		int b=sn.nextInt();
		     printEven(a,b);
		    printOdd(a,b);
	}
	public static void printEven(int a,int b)
	{
		for(int i=a;i<=b;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" ");
			}
		}
	}
	public static void printOdd(int a,int b)
	{
		for(int i=a;i<=b;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i+" ");
			}
		}
	}
}
