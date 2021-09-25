 import java.awt.Color;
 import java.lang.Math;
/**
 * 
 * @author Noah Burnette
 * @version 9/20/21
 * Project 2
 * Figure class is abstract and is the parent class of Ellipse and Rectangle
 *
 */
abstract public class Figure {
	protected BoundingBox boundBox;
	protected Color clr;
	protected boolean visible;
	/**
	 * 
	 * @param boundBox
	 * @param clr
	 * @param visible
	 * Constructor for Figure class
	 */
	public Figure(BoundingBox boundBox,Color clr,boolean visible) {
		this.boundBox = boundBox;
		this.clr = clr;
		this.visible = visible;
	}
	/**
	 * Sets the instance variable visible to true
	 */
	public void makeVisible() {
		visible = true;
	}
	/**
	 * Sets the instance variable visible to false
	 */
	public void makeInVisible() {
		visible = false;
	}
	/**
	 * 
	 * @param clr- Color object
	 * Changes the instance variable clr to a different object
	 *  
	 */
	public void setColor(Color clr) {
		this.clr = clr;
	}
	/**
	 * Abstract method that is used as the basis for each subclass and overridden
	 */
	abstract public double area();
	/**
	 * 
	 * @param factor- double that indicates the new size of the area
	 * creates a new object from BoundingBox that is then set as the new instance variable boundBox
	 * 
	 * 
	 */
	public void dilate(double factor) {
		this.boundBox = new BoundingBox(
				boundBox.point, 
				boundBox.width * Math.sqrt(factor),
				boundBox.height * Math.sqrt(factor));
	}
	/**
	 * 
	 * @param horizontal- represents the distance the instance variable x moves
	 * @param vertical- represents the distance the instance variable y moves
	 * creates a new Point and BoundingBox object in order to shift the coordinates of x and y
	 * 
	 */
	public void translate(double horizontal,double vertical) {
		Point translate = new Point(this.boundBox.point.x + horizontal,this.boundBox.point.y + vertical);
		this.boundBox = new BoundingBox(translate,this.boundBox.width,this.boundBox.height);
	}
	/**
	 * 
	 * @param fig0- comparator
	 * @param fig1- compared
	 * @return boolean- whether fig0's area is larger than fig1's
	 * checks to which figure has a larger area
	 * 
	 */
	static public boolean larger(Figure fig0,Figure fig1) {
		if(fig0.area() > fig1.area()) {
			return true;
		}
		else {
			return false;
		}
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
		Figure other = (Figure) obj;
		if (boundBox == null) {
			if (other.boundBox != null)
				return false;
		} else if (!boundBox.equals(other.boundBox))
			return false;
		if (clr == null) {
			if (other.clr != null)
				return false;
		} else if (!clr.equals(other.clr))
			return false;
		if (visible != other.visible)
			return false;
		return true;
	}
	/**
	 * @return String
	 * toString method that prints object
	 */
	@Override
	public String toString() {
		return "Figure [boundBox=" + boundBox + ", clr=" + clr + ", visible=" + visible + "]";
	}
	
	
	
	

}
