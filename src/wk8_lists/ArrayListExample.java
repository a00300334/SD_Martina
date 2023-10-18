package wk8_lists;

import java.util.ArrayList;

public class ArrayListExample {
	private ArrayList<Person> theListPeople = new ArrayList();
	
	public ArrayListExample() {
		theListPeople.add(new Person("Josh", "2342343", "Persion"));
		theListPeople.add(new Person("Affffsh", "22342343", "Oersion"));
		theListPeople.add(new Person("adfsh", "24234234232343", "Sfdrsion"));
		theListPeople.add(new Person("Josha", "23423425345343", "asdrsion"));
		theListPeople.add(new Person("Mofoddh", "2346343453462343", "Pddn"));
	}

	
	public Person getRefForName(String pName) {
		//because array list does not store tagged value
		//you need to search entire one
		for(Person p : this.theListPeople) {
			if(p.getName().equals(pName)) {
				return p;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		ArrayListExample a = new ArrayListExample();
		Person p = a.getRefForName("Josha");
		System.out.println(p.toString());
	}

}
