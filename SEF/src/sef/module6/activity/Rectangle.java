package sef.module6.activity;

public class Rectangle extends Shape{
	
	private double length;
	private double breadth;

	public Rectangle(String color, double length, double breadth) {
		super.setColor(color);
		this.length = length;
		this.breadth = breadth;
	}
	@Override
	double calculateArea() {
		return length*breadth;
	}
	@Override
	public double calculatePerimeter() {
		return 2*length*breadth;
	}
	
}
