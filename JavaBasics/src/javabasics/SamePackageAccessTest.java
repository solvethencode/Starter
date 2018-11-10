package javabasics;

public class SamePackageAccessTest {
	
	
	public static void main(String[] args) {
		HelloWorld hw=new HelloWorld();
		HelloWorld hw2=new HelloWorld();	
		HelloWorld hw3=new HelloWorld();
		HelloWorld hw4=new HelloWorld();
		hw.staticVar="Main brand is changed";
		hw.setName("Oguz");
		hw4.staticVar="Main brand is changed 2";
		//hw.protectedVar="Value is assigned!";
		System.out.println(HelloWorld.staticVar);	
		System.out.println(hw.getName());
		System.out.println(hw.protectedVar);
		System.out.println(hw2.staticVar);	
		System.out.println(hw2.getName());	
		System.out.println(hw3.staticVar);
		System.out.println(hw3.getName());
		System.out.println(hw4.staticVar);
		System.out.println(hw4.getName());
	}
	

}
