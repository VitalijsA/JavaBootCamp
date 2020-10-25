package finalActivity;

public class FibonacciPrint {

	public static void main(String[] args) {
		System.out.print("User inputs 7 -> ");
		Fibonacciprint(7);
		System.out.println();
		System.out.print("User inputs 10 -> ");
		Fibonacciprint(10);
	}
	public static void Fibonacciprint(int input) {
		int f1 = 0, f2 = 1, total = 0;
		boolean firstStep = true;
		while (input != 2) {
			if (firstStep == true) {
				System.out.print(f1 +" "+f2+" ");
				total = f1 + f2;
				f1 = f2;
				f2 = total;
				firstStep = false;
				System.out.print(total+" ");
			} 
			else {
				f1 = f2;
				f2 = total;
				total = f2 + f1;
				System.out.print(total +" ");
			}
			input--;
		}
	}
}
