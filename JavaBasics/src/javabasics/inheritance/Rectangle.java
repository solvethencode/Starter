package javabasics.inheritance;

public class Rectangle {
	private double width;
	private double length;
	
	public Rectangle() {}
	public Rectangle(double width, double length){
		this.width=width;
		this.length=length;	
	}
	double area()
	{
		return getLength()*getWidth();
	}
	
	String sayHello() {
		return "Hello";
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

}
