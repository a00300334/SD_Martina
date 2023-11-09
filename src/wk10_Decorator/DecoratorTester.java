package wk10_Decorator;

public class DecoratorTester {

	public static void main(String[] args) {
		Shape circle = new Circle();
		System.out.println("Circle with normal border");
		circle.draw();
		
		Shape redCircle = new RedShapeDecorator(new Circle());
		System.out.println("\nCircle with red border");
		redCircle.draw();
		
		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		System.out.println("\nRectangle with red border");
		redRectangle.draw();
		
		Shape blueCircle = new BlueShapeDecorator(new Circle());
		System.out.println("\nCircle with blue border");
		blueCircle.draw();
		
		Shape blueRectangle = new BlueShapeDecorator(new Rectangle());
		System.out.println("\nRectangle with blue border");
		blueRectangle.draw();

	}

}
