package javabasics;
import javabasics.packages.*;
class Child extends Father{	
	String name="MyLastNameIsNew";
	
	public static void main(String[] args) {
		Father f=new Father();
		Child c=new Child();
		System.out.println();
		System.out.println("F: "+f.fName);
	}
}
