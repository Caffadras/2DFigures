 
public class Circle extends Figure2D implements Drawable{
	/**
	 * string representation of a circle. used in {@link #draw()} method
	 */
	private final String pattern = "    # #    \n"
								 + " #       # \n"
								 + "#         #\n"
								 + " #       # \n"
								 + "    # #    \n";
	private double radius; 
			
	private Circle (double aRadius) {
		radius = aRadius;
	}
	
	/**
	 * Factory method. Constructs a circle instance. Can return null.
	 * @param aRadius Radius of the circle.
	 * @return null, if <strong>aRadius</strong> is negative or zero, else return new instance of Circle.
	 */
	
	public static Circle construct(double aRadius) {
		if (aRadius <= 0) {
			System.out.println("Circle cannot have a negative radius!");
			return null;
		}		
		return new Circle(aRadius);
	}
	
	public double getRadius() {
		return radius;
	}
	
	@Override
	public double getArea() {
		return 3.14159265359 * radius * radius;
	}
	
	@Override 
	public double getPerimeter() {
		return 2 * 3.14159265359 * radius;
	}
	
	/**
	 * "Draws" circle string representation on the console.
	 */
	@Override
	public void draw() {
		System.out.println(pattern);
	}
}
