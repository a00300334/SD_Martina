package wk8_lists;

import java.util.HashMap;

public class HashMapExample {

	private HashMap<String, Person> theListo = new HashMap();
	
	public HashMapExample() {
		theListo.put("Josh", new Person("Josh", "2342343", "Persion"));
		theListo.put("Affsh", new Person("Affffsh", "22342343", "Oersion"));
		theListo.put("adfsh", new Person("adfsh", "24234234232343", "Sfdrsion"));
		theListo.put("Josha", new Person("Josha", "23423425345343", "asdrsion"));
		theListo.put("Mofoddh", new Person("Mofoddh", "2346343453462343", "Pddn"));
	}
	
	public Person getFromName(String name) {
		return theListo.get(name);
	}
	
	public static void main(String[] args) {
		HashMapExample a = new HashMapExample();
		Person p = a.getFromName("Josha");
		System.out.println(p.toString());

	}

}
