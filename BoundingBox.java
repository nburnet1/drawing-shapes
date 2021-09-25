/**
 * 
 * @author Noah Burnette
 * @version 9/20/21
 * Project 2
 * BoundingBox class is used to implement a box around shapes that helps calculate area and hold coordinates
 */
public class BoundingBox {
	final protected Point point;
	final protected double width;
	final protected double height;
	/**
	 * 
	 * @param point- Point class object
	 * @param width- distance from x-axis
	 * @param height- distance from y-axis
	 * Constructor for BoundingBox class
	 * 
	 */
	public BoundingBox(Point point, double width, double height) {
		this.point = point;
		this.width = width;
		this.height = height;
	}
	/**
	 * 
	 * @return point- Point class object
	 * Accessor for point object
	 * 
	 */
	public Point getPoint() {
		return point;
	}
	/**
	 * 
	 * @return width- a double that represents the distance from x-axis
	 * Accessor for width Double
	 * 
	 */
	public double getWidth() {
		return width;
	}
	/**
	 * 
	 * @return height- a double that represents the distance from y-axis
	 * Accessor for height Double
	 */
	public double getHeight() {
		return height;
	}
	/**
	 * @return String
	 * toString method that prints object
	 */
	@Override
	public String toString() {
		return "BoundingBox [point=" + point + ", width=" + width + ", height=" + height + "]";
	}
	/**
	 * 
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
		BoundingBox other = (BoundingBox) obj;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (point == null) {
			if (other.point != null)
				return false;
		} else if (!point.equals(other.point))
			return false;
		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
			return false;
		return true;
	}
	
	

}
