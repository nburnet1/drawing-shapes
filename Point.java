/**
 * 
 * @author Noah Burnette
 * @version 9/20/21
 * Project 2
 * Point class is used to represent the coordinates as instance variables 
 *
 */
public class Point {
	final protected double x;
	final protected double y;
/**
 * 
 * @param x- first coordinate of point
 * @param y- second coordinate of point
 * 
 * Constructor for Point class
 * 
 */
	public Point(double x,double y) {
		this.x = x;
		this.y = y;
	}
	/**
	 * 
	 * @return instance variable x
	 * accessor for x
	 * 
	 */
	public double getX() {
		return x;
	}
	/**
	 * 
	 * @return instance variable y
	 * accessor for y
	 * 
	 */
	public double getY() {
		return y;
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
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		return true;
	}

	/**
	 * @return String
	 * toString method that prints object
	 */
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	

}
