import java.awt.Color;
import java.lang.Math;

/**
 * 
 * @author Noah Burnette
 * @version 9/20/21
 * Project 2
 * Ellipse class represents shapes that have a different semi-axes length. Parent class of Circle class and Subclass of Figure class.
 *
 */
public class Ellipse extends Figure{
	final protected double PI = Math.PI;
	/**
	 * 
	 * @param x- first coordinate of point Object
	 * @param y- second coordinate of point Object
	 * @param semiMajor- length of minor axis
	 * @param semiMinor- length of major axis
	 * @param clr- Color object 
	 * 
	 * Constructor for Ellipse class
	 * 
	 */
	public Ellipse(double x, double y,double semiMajor,double semiMinor,Color clr) {
		super(new BoundingBox(new Point(x,y),semiMajor,semiMinor),clr,false);
	}
	/**
	 * @return area as double 
	 * Calculates area by multiplying Semi-major, Semi-minor, and PI
	 */
	@Override
	public double area() {
		return boundBox.width * boundBox.height * PI ;
	}
	/**
	 * 
	 * @return Point object
	 * accessor for object point
	 */
	public Point getCoordinates() {
		return boundBox.point;
	}
	/**
	 * 
	 * @return double semiMajor- represents width
	 * accessor for semiMajor
	 * 
	 */
	public double getSemiMajor() {
		return boundBox.width;
	}
	/**
	 * 
	 * @return double semiMinor- represents height
	 * accessor for semiMinor
	 * 
	 */
	public double getSemiMinor() {
		return boundBox.height;
	}
	/**
	 * @return String
	 * toString method that prints object
	 */
	@Override
	public String toString() {
		return "Ellipse-\n"
				+ "x = " + boundBox.point.x + "\n"
				+ "y = " + boundBox.point.y + "\n"
				+ "semiMajor = " + boundBox.width + "\n"
				+ "semiMinor = " + boundBox.height + "\n"
				+ "color = " + clr + "\n"
				+ "area = " + area() + "\n";
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
	
	

}
