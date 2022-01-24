
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Square aSquare = Square.construct(10.0);
		Square wrongSquare = Square.construct(-10); //is null
		
		Circle aCircle = Circle.construct(5.0);
	
		drawObject(aSquare);
		drawObject(wrongSquare); //nothing will happen
		drawObject(aCircle);
		
		System.out.println("A circle with radius " + aCircle.getRadius() + " has area " 
							+ aCircle.getArea() + " and perimeter " + aCircle.getPerimeter());
	
		System.out.println("A square with side length of " + aSquare.getSideLength() + " has area " 
				+ aSquare.getArea() + " and perimeter " + aSquare.getPerimeter());
	
	}
	
	
	/**
	 * calls draw() method from a drawable object.
	 * @param drawable any object, that implements Drawable interface. if it is null, nothing is drawn
	 */
	public static void drawObject(Drawable drawable) {
		if  (drawable == null) return;
		drawable.draw();
	}

}
