package javabasics;

public class CalcTest {
	public static void main(String[] args) {
		Calc c = new Calc();
		String a="sadaa    ";
		System.out.println(a.trim().concat(" ss").toUpperCase());
		c.plus(10);
		System.out.println(c.getResult());
		c.plus(5).plus(15).plus(10).plus(3);
		Calc h = c.plus(12);
		System.out.println("H :"+h.getResult());
		Calc c2 = c.plus(3);
		System.out.println(c.getResult());
		System.out.println("H :"+h.getResult());
		// you cannot just print out the object }
	}
}
