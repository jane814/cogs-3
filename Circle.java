/**
 *Circle defines the Circle subclass of Shape
 * 
 * Bugs:
 * 
 * @Jae Eun Lee
 */
public class Circle extends Shape {

	private double radius;
	static final double PI = 3.1415;

	public Circle() {
		super("Circle", 0.0);
		radius = 0.0;
	}


	public Circle(double radius) {
		super("Circle",PI*radius*radius);
		this.radius = radius;
	}
	
	/**
	 *method that retrieves the radius of a circle object
	 * 
	 *@return double value that represents the radius of a circle object
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 *method that reveals the attributes of a circle object
	 * 
	 * @return String value that holds the attributes of a circle object
	 */
	public String toString() {
		return super.toString() + ", Radius: " + radius;
	}
}
