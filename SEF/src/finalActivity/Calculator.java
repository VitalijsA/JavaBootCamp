package finalActivity;
import java.util.Scanner;
public class Calculator{
    public static void main(String[] args)
    {
        System.out.print("Enter first number:");
        Scanner inp= new Scanner(System.in);
        int num1,num2;
        num1 = inp.nextInt();
        System.out.print("Enter second number:");
        num2 = inp.nextInt();
        System.out.print("Enter your selection: 1 - Addition, 2 - Substraction, 3 - Multiplication, 4 - Division:");
        int choose;
        choose = inp.nextInt();
        switch (choose){
        case 1:
            System.out.println("Addition result is: "+add( num1,num2));
            break;
        case 2:
            System.out.println("Substraction result is: "+sub( num1,num2));
            break;      
        case 3:
            System.out.println("Multiplication result is: "+mult( num1,num2));
            break;
        case 4:
            System.out.println("Division result is: "+div( num1,num2));
            break;
            default:
                System.out.println("Illegal Operation");
        }
        inp.close();

    }
    public static int add(int x, int y)
    {
        int result = x + y;
        return result;
    }
    public static int sub(int x, int y)
    {
        int result = x-y;
        return result;
    }
    public static double mult(double x, double y)
    {
    	double result = x*y;
        return result;
    }
    public static double div(double x, double y)
    {
    	double result = 0;
    	if (y == 0) {
    		System.out.println("Division by 0 is not allowed");
    	}else {
    		result = x/y;
    	}
        return result;
    }

}