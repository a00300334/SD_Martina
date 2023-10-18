package wk8_lists;

public class GenericsExample {

	public static < E > void printArray ( E[] arrayElements) {
		for (E el : arrayElements ) {
			System.out.println(el);
		}
	}
	
	public static void main(String[] args) {
		Integer[] integerArray = {1,2,3,4,5};
		Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5};
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O'};
		
		printArray(integerArray);
		printArray(doubleArray);
		printArray(charArray);

	}
	
}
