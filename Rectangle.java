import java.awt.Color;

/**
 * 
 * @author Noah Burnette
 * @version 9/20/21
 * Project 2
 * Rectangle class represents shapes that have different widths and heights. Parent class of Square class and Subclass of Figure class.
 *
 */
public class Rectangle extends Figure {
	
	/**
	 * 
	 * @param x- first coordinate of point Object
	 * @param y- second coordinate of point Object
	 * @param width- distance from x
	 * @param height- distance from y
	 * @param clr- Color object 
	 * 
	 * Constructor for Rectangle class
	 * 
	 */
	public Rectangle(double x,double y,double width,double height, Color clr) {
		super(new BoundingBox(new Point(x,y),width,height),clr,false);
	}
	/**
	 * Area calculated by multiplying height and width
	 */
	@Override
	public double area() {
		return boundBox.width * boundBox.height;
	}
	/**
	 * 
	 * @return double x
	 * accessor for x
	 * 
	 */
	public double getX() {
		return boundBox.point.x;
	}
	/**
	 * 
	 * @return double y
	 * accessor for y
	 * 
	 */
	public double getY() {
		return boundBox.point.y;
	}
	/**
	 * 
	 * @return double Width
	 * accessor for width
	 * 
	 */
	public double getWidth() {
		return boundBox.width;
	}
	/**
	 * 
	 * @return double height
	 * accessor for height
	 * 
	 */
	public double getHeight() {
		return boundBox.height;
	}
	/**
	 * @return String
	 * toString method that prints object
	 */
	@Override
	public String toString() {
		return "Rectangle-\n"
				+ "x = " + boundBox.point.x + "\n"
				+ "y = " + boundBox.point.y + "\n"
				+ "width = " + boundBox.width + "\n"
				+ "height = " + boundBox.height + "\n"
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
