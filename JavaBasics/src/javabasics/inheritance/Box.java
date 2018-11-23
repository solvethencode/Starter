package javabasics.inheritance;

import javabasics.Family;

public class Box extends Rectangle {
	
	private double height;
	public Box(int length)
	{}
	public Box() {
		super(1,2);
		this.height=3;		
		
	}
	
	public static void main(String[] args) {
		Rectangle myRectangle = new Rectangle(5, 3);
		Family fam=new Family();
		Box myBox = new Box();
		myBox.setLength(6);
		myBox.setWidth(5);
		myBox.setHeight(4);
				
		System.out.println("Area of Rectangle :"+myRectangle.area());
		System.out.println("Area of Box :"+myBox.sayHello());

	}
	
	public double area()
	{
		return 2 * (getLength() * getWidth()
                + getLength() * height 
                + getWidth() * height);

	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	

}
