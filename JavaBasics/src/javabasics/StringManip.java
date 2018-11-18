package javabasics;

public class StringManip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//equal for objects
		// == for primitives and literals
		String s="Hello";
		String t=new String(s);
		
		if ("Hello".equals(s)) System.out.println("One");//one
		if (t==s) System.out.println("Two");//
		if(t.equals(s)) System.out.println("Three");//three
		if ("Hello"==s) System.out.println("Four");//four
		if ("Hello"==t) System.out.println("Five");//
	}

}
