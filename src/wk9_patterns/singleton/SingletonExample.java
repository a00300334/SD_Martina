package wk9_patterns.singleton;

public class SingletonExample {

	private static SingletonExample s = null;
	
	private SingletonExample() {
		
	}
	
	public static SingletonExample getInstance() {
		if(s == null) {
			s = new SingletonExample();
			return s;
		}else {
			return s;
		}
	}
}
