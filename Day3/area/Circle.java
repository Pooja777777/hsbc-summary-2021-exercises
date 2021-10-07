package com.hsbc.area;

public class Circle implements Shape
{

	@Override
	public String area(Double radius) {
		double area=2*3.14*radius*radius;
		return "The area of Circle is : "+area+ " (centimeter)^2";
	}

}
