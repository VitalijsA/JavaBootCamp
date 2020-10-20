package sef.module9.activity;
//Needs to be completed

import java.util.HashMap;


public class MapActivity {

	static String temp = "My Testing" ;
	
		public static void main(String[] args) {
			//1 - Type code to create a HashMap of key value pair
			//where key is id of type String and value is a name
			HashMap<String, String> myMap = new HashMap<String, String>();
			print(temp);
			print1(10);
			print2(temp);
			print3(temp);
			//2 - Call print method to print the map passed as its parameter.
		
		}
		
		static void print(String test)
		{
			int temp = Integer.valueOf(test);
			
			System.out.println(test.toUpperCase());
		
		}
		static void print1(int a)
		{
			//int a = 10; 
			for (int i = 0 ; i< a; i++) {
				System.out.println(a);
			}
		
		}
		static void print2(String test)
		{
			int temp = Integer.valueOf(test);
			
			System.out.println(test.toUpperCase());
		
		}
		static void print3(String test)
		{
			int temp = Integer.valueOf(test);
			
			System.out.println(test.toUpperCase());
		
		}
	}
