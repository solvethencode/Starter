package javabasics;

public class Iphone7 extends Iphone {

	String name="iPhone 7";

	public Iphone7()
	{
		super.hasHomeButton=true;
	}
	
	final String say()
	{
		return "I am saying..";
	}
	
	
	public static void main(String[] args) {
		Iphone7 i7=new Iphone7();
		System.out.println(i7.brand);
		System.out.println(i7.hasHomeButton?"Has home button":" Doesn't have");
	}
}
