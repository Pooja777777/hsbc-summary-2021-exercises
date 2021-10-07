package com.hsbc.area;

import java.util.Scanner;

public class TestArea {
	
	public static void main(String args[])
	{
		Scanner sn = new Scanner(System.in);
		System.out.println("For Circle");
		Circle c = new Circle();
		System.out.println("Enter the radius in Centimeter");
		double radiusOfCircle = sn.nextDouble();
		FindArea.typesOfShape(c,radiusOfCircle);
		System.out.println("For Sphere");
		Sphere s = new Sphere();
		System.out.println("Enter the radius in Centimeter");
		double radiusOfSphere = sn.nextDouble();
		FindArea.typesOfShape(s,radiusOfSphere);
	}

}
