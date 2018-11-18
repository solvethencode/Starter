package javabasics.inheritance;

public class Box extends Rectangle {
	
	private double height;
	
	public static void main(String[] args) {
		Rectangle myRectangle = new Rectangle(5, 3);
		Box myBox = new Box();
		myBox.setLength(6);
		myBox.setWidth(5);
		myBox.setHeight(4);
				
		System.out.println("Area of Rectangle :"+myRectangle.area());
		System.out.println("Area of Box :"+myBox.area());

	}
	
//	public double area()
//	{
//		return 2 * (getLength() * getWidth()
//                + getLength() * height 
//                + getWidth() * height);
//
//	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	

}
