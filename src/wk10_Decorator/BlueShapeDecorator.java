package wk10_Decorator;

public class BlueShapeDecorator extends ShapeDecorator	{
	
	public BlueShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}
	
	@Override
	public void draw() {
		decoratedShape.draw();
		setBlueBorder(decoratedShape);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
	}
	
	private void setBlueBorder(Shape decoraShape) {
		System.out.println("Border Color: Blue");
	}
}

