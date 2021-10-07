package com.hsbc.area;

public class Sphere implements Shape
{

	@Override
	public String area(Double radius) {
		double area=4*3.14*radius*radius;
		return "The area of Sphere is : "+area+" (centimeter)^4";
	}

}
