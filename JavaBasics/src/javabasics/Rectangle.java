package javabasics;

public class Rectangle extends Shape {
	final static private String name="Rectangle";
	private int height;
	private int width;
	
	public Rectangle()
	{}
	public Rectangle(int h,int w)
	{
		super();
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Rectangle rec=new Rectangle();
		rec.sides=4;
		System.out.println(rec.sides);
		System.out.println(rec.name);

	}

}
