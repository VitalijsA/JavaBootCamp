package sef.module6.activity;

public class AbstractionActivity {

	public static void main(String[] args) {
		Rectangle a = new Rectangle("black", 10, 5);
		System.out.println("Area is: " +a.calculateArea());
		System.out.println("Perimeter is: "+ a.calculatePerimeter());
		System.out.println("Color of a rectangle is: " +a.getColor());
	}

}
