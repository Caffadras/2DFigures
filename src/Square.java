
public class Square extends Figure2D implements Drawable{
	/** 
	 * string representation of a square. used in {@link #draw()} method
	 */
	private final String pattern = "# # # # #\n"
								 + "#       #\n"
								 + "#       #\n"
								 + "#       #\n"
								 + "# # # # #\n";
	private double sideLength;
	
	/**
	 * is called by factory method {@link #construct(double)}
	 * @param aSideLength
	 */
	private Square(double aSideLength){
		sideLength = aSideLength; 
	}
	
	/**
	 * Factory method. Constructs a square instance. Can return null.
	 * @param aSideLength Side length of the square.
	 * @return null, if <strong>aSideLength</strong> is negative or zero, else return new instance of Square.
	 */
	public static Square construct(double aSideLength) {
		if (aSideLength <=0) {
			System.out.println("Square cannot have a negative side length!\n");
			return null;
		}
		return new Square(aSideLength);
	}
	
	public double getSideLength() {
		return sideLength;
	}
	
	@Override
	public double getArea() {
		return sideLength * sideLength;
	}
	
	@Override
	public double getPerimeter() {	
		return  sideLength * 4;
	}
	
	/**
	 * "Draws" square string representation on the console.
	 */
	@Override
	public void draw() {
		System.out.println(pattern);
	}
}
