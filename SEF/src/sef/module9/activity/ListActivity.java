package sef.module9.activity;
import java.util.ArrayList;
//Needs to be completed

public class ListActivity {

	public static void main(String[] args) {
		//1 - Type code to create a list of names. Use ArrayList.
		ArrayList<String> names = new ArrayList<String>();
		names.add("Vitalijs");
		names.add("Arturs");
		names.add("Janis");
		//2 - Call print method to print the list passed as its parameter.
		print(names);
	}
	
	static void print(ArrayList<String> list)
	{
		//3 - Type code to print this list
		for (String i : list) {
			System.out.println(i);
		}
		//Notice the order in which elements get printed.
	
	}
}
