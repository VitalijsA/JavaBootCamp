package sef.module9.sample;
//Needs to be completed
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ListSample {
	public static void main(String[] args) {

		//Create an ArrayList
	    List<String> list = new ArrayList<String>();
	    // List implemented as growable array
	    
	    // Add an element to the list
	    list.add("a");
	    
	    // Insert an element at the head of the list
	    list.add(0, "b");
	    
	    // Get the number of elements in the list
	    int size = list.size();          // 2
	    System.out.println("Size of list is: " +size);
	    // Retrieving the element at the end of the list
	    Object element = list.get(list.size()-1);   // a
	    System.out.println("Last element of list is: " +element);
	    // Retrieving the element at the head of the list
	    element = list.get(0);                      // b
	    System.out.println("First element of list is: " +element);
	    // Remove the first occurrence of an element
	    boolean b = list.remove("b");      // true
	    b = list.remove("b");              // false
	    
	    // Remove the element at a particular index
	    element = list.remove(0);          // a

	    
	    //1 - Add 3 more elements to the list - A, B and C
	    list.add("C");
	    list.add("B");
	    list.add("A");
	    
	    
	    
	    
		//call a method which prints this list
	    ListSample obj=new ListSample();
	    obj.print(list);
	}

	void print(List<String> l)
	{
		//Iterator is an interface which provides a uniform way to access
		//individual elements of a Collection
		
		//2 - Use Iterator to iterate over this list.
		Iterator<String> i = l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
			}
}
