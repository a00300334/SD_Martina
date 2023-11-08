package wk10_Decorator;

public class BlueShapeDecorator extends Shape	{
	protected Shape decoratedShape;
	
	public BlueShapeDecorator(Shape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}
	
	@Override
	public void draw() {
		decoratedShape.draw();
		decoratedShape                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	}
}

