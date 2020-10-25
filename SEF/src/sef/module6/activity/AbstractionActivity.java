package sef.module6.activity;

public class AbstractionActivity {

	public static void main(String[] args) {
		Shape a = new Rectangle(10, 5);
		a.setColor("Black");
		System.out.println("Area is: " +a.calculateArea());
		System.out.println("Perimeter is: "+ a.calculatePerimeter());
		System.out.println("Color of a rectangle is: " +a.getColor());
	}

}
