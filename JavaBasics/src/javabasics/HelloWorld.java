package javabasics;

public class HelloWorld {

	//public, private,protected, default
	private String name;
	//final means constants that are not changeable
	public static final String staticFinalVar="static final var";
	public final String mainBrand="MERCEDES";
	
	public static String staticVar="Main Brand";
	//default
	String myVar;
	public String publicVar;
	public long product;
	//accessable from within sam package
	protected String protectedVar="protecdet default value";
	
	private long multiplyNumbers(int a, int b)
	{
		product=a*b;
		return product;
	}
	
	public long getResults()
	{
		product=multiplyNumbers(4,7);
		return product;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Hello World");
	}

}
