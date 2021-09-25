import java.awt.Color;
public class Driver {

	public static void main(String[] args) {
	//Rectangle Test
		Rectangle rec0 = new Rectangle(0,0,1.0,32.0,new Color(0,0,0));
		Rectangle rec1 = new Rectangle(0,0,1.0,32.0,new Color(0,0,0));
		Rectangle rec2 = new Rectangle(0,1,10.0,15.0,new Color(25,25,25));
		
		Square sqr0 = new Square(0,0,4,new Color(0,0,0)); 
		Square sqr1 = new Square(0,0,4,new Color(0,0,0));
		Square sqr2 = new Square(3,2,16,new Color(100,100,100));
		
		Ellipse ell0 = new Ellipse(0,0,20,25,new Color(0,0,0));
		Ellipse ell1 = new Ellipse(0,0,20,25,new Color(0,0,0));
		Ellipse ell2 = new Ellipse(0,0,15,25,new Color(100,100,100));
		
		Circle cir0 = new Circle(2,2,4,new Color(0,0,0));
		Circle cir1 = new Circle(2,2,4,new Color(0,0,0));
		Circle cir2 = new Circle(0,0,25,new Color(100,100,100));
		
		Figure arr[] = {rec0,rec1,rec2,sqr0,sqr1,sqr2,ell0,ell1,ell2,cir0,cir1,cir2};
		for(int i = 0; i < arr.length; i += 3) {
			System.out.println("Figure0 " + arr[i]);
			System.out.println("Figure1 " + arr[i+1]);
			System.out.println("Figure2 " + arr[i+2]);
			
			System.out.println("Equals: " + arr[i].equals(arr[i+1]));
			System.out.println("\nTranslating and Dilating...");
			arr[i].translate(2.34, 2.54);
			arr[i].dilate(2);
			arr[i+2].translate(293.43, 24.54);
			arr[i+2].dilate(4);
			arr[i+2].makeVisible();
			arr[i+2].makeInVisible();
			System.out.println("Equals: " + arr[i].equals(arr[i+1]));
			System.out.printf("Area0: %.2f Area1: %.2f\n",arr[i].area(),arr[i+1].area());
			System.out.println("Larger: " + Figure.larger(arr[i],arr[i+1])+"\n");
			System.out.println("Reprinting last array:\n" + arr[i+2]);
		}
		
	}

}
