import java.awt.Color;

/**
 * 
 * @author Noah Burnette
 * @version 9/20/21
 * Project 2
 * Circle class represents shapes that have a radius and both semi-axes are equivalent. Subclass of both Figure and Ellipse classes.
 *
 */
public class Circle extends Ellipse {
	/**
	 * 
	 * @param x- first coordinate of point Object
	 * @param y- second coordinate of point Object
	 * @param radius- distance from both x and y axes
	 * @param clr- Color object
	 * Constructor for Circle class
	 * 
	 */
	public Circle(double x, double y, double radius, Color clr) {
		super(x,y,radius,radius,clr);
	}
	/**
	 * 
	 * @return area as double 
	 * Calculates area by multiplying radius^2 and PI
	 * 
	 */
	@Override
	public double area() {
		return boundBox.height * boundBox.width * PI;
	}
	/**
	 * 
	 * @return double radius- represents distance from both x and y
	 * accessor for radius
	 */
	public double getRadius() {
		return boundBox.height;
	}
	/**
	 * @param Object that is compared to
	 * @return boolean
	 * checks to see if two objects are the same
	 * 
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}
	/**
	 * @return String
	 * toString method that prints object
	 */
	@Override
	public String toString() {
		return "Circle-\n"
				+ "x = " + boundBox.point.x + "\n"
				+ "y = " + boundBox.point.y + "\n"
				+ "radius = " + boundBox.width + "\n"
				+ "color = " + clr + "\n"
				+ "area = " + area() + "\n";
	}
	
	
	

}
