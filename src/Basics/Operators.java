package Basics;

public class Operators {
	public static void main(String[] args) {
		
		// arithmatic + - * / %
		int a = 10; 
		int b = 20;
		System.out.println(a*b);
		System.out.println(a % 3);
		
		// unary operators
		// increment 
		b = a++ + ++a;
		System.out.println(a);
		System.out.println(b);

		// decrement
		System.out.println(a--);
		// a = 11
		System.out.println(--a);
		//a 10
		
		boolean bool = true;
		System.out.println(!bool);
		System.out.println(!!bool);
		
		// unary -
		b = -a;
		System.out.println(b);
		
		// relational
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a == -b);
		
		// logical		
		System.out.println(a > b && a > 15);
		System.out.println(a > b || a > 15);
		
		// ternary
		System.out.println(a > b ? "a is greater" : "b is greater");
		
		// assignment
//		a = a + 15;
		a += 15;
		System.out.println(a);
	}
}
