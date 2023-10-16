package wk8_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Maina {

	// Colletions ( List Set ) 
	// TreeMap is sorted
	
	// Interfaces:
	
	
	//Set
	//Cannot contain duplicate elements
	
	// List
	// Can contain duplicates
	
	// Map 
	// SortedMap 
	
	//Iterators ( two years exam on exam probably ) 
	// boolean hasNext() 
	// next() giving you object
	// remove() will remove element
	// add(Object o) 
	// boolean hasPrevious()
	// Previous() will give you prev object
	// int previousindex() returns prev element and if not then -1
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		
		al.add("R");
		al.add("T");
		al.add("E");
		al.add("A");
		al.add("U");
		al.add("P");
		al.add("W");
		al.add("P");
		
		ListIterator litr = al.listIterator();
		
		while(litr.hasNext()) {
			Object element = litr.next();
			System.out.print(element + " ");
		}
		
		ListIterator l = al.listIterator();
		
		while(l.hasNext()) {
			Object e = l.next();
			l.set(e + " + ");
		}
		
		System.out.println("updated list");
		Iterator i= al.listIterator();
		while(i.hasNext()) {
			Object e1 = i.next();
			System.out.print(e1 + " ");
		}
		
	}

}
