package javabasics;

public class StringManip2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String pool and heap memory
		// What is the Java String interning
		 System.out.println(Fruit.TYPE);
		String s ="Hel";//literal	
		String s1 = s + "lo";//not a literal
		String s2 = "Hello";//literal
		System.out.println(s1 == s2);//false
		s1=s1.intern(); //interns s1 means puts it to the String pool
		System.out.println(s1 == s2);//true
		}
	
	
	interface IFruit
	{
	    public String TYPE = "Apple";
	}

	class Fruit implements IFruit
	{

	}



}
