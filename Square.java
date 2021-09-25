import java.awt.Color;

/**
 * 
 * @author Noah Burnette
 * @version 9/20/21
 * Project 2
 * Square class represents shapes that have equivalent widths and heights. Subclass of Figure and Rectangle classes
 *
 */
public class Square extends Rectangle {
	/**
	 * 
	 * @param x- first coordinate of point Object
	 * @param y- second coordinate of point Object
	 * @param length- distance from both x and y axes
	 * @param clr- Color object
	 * Constructor for Square class
	 * 
	 */
	public Square(double x, double y, double length, Color clr) {
		super(x, y, length, length, clr);
	}
	/**
	 * 
	 * @return double length
	 * accessor for length
	 * 
	 */
	public double getLength() {
		return boundBox.width;
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
	 * @return area as double
	 * method that calculates the area of a square by multiplying width * height in which both values are equal
	 */
	@Override
	public double area() {
		return boundBox.width * boundBox.height;
	}
	/**
	 * @return String
	 * toString method that prints object
	 */
	@Override
	public String toString() {
		return "Square-\n"
				+ "x = " + boundBox.point.x + "\n"
				+ "y = " + boundBox.point.y + "\n"
				+ "length = " + boundBox.width + "\n"
				+ "color = " + clr + "\n"
				+ "area = " + area() + "\n";
	}

	
	
	

}
