package Basics;

public class Conditionals {
	public static void main(String[] args) {
		int age = 21;
		
		if(age < 18) {
			System.out.println("minor");
			
		} else {
			System.out.println("adult");
		}
		
		System.out.println(age < 18 ? "minor" : "adult");
		
		
		// check age is odd or even
		if(age % 2 == 0) {
			System.out.println("Age is even");
		}
		else {
			System.out.println("Age is odd");
		}
		
		// if else ladder
		// max of 3 numbers
		int a = 15, b = 15, c = 15;
		
		if(a >= b && a >= c) {
			System.out.println(a);
		} 
		else if(b >= a && b >= c) {
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}
		
		// nested if else
		if(a >= b) {
			if(a >= c) {
				System.out.println(a);
				if(b > c) {
					
				}
			}
			
		}
		
		int day = 5;
		
		if(day == 1) {
			System.out.println("Monday");
		} 
		else if(day == 2) {
			System.out.println("Tuesday");
		}
		else if(day == 3) {
			System.out.println("Wednesday");
		}
		else if(day == 4) {
			System.out.println("Thursday");
		}
		else if(day == 5) {
			System.out.println("Friday");
		}
		else if(day == 6) {
			System.out.println("Saturday");
		}
		else if(day == 7) {
			System.out.println("Sunday");
		}
		else {
			System.out.println("invalid day");
		}
		
		System.out.println("**********************");
		
		switch(day) {
			case 1: System.out.println("Monday");
			break;
			
			case 2: System.out.println("Tuesday");
			break;
			
			case 3: System.out.println("Wednesday");
			break;
			
			case 4: System.out.println("Thursday");
			break;
			
			case 5: System.out.println("Friday");
			break;
			
			case 6: System.out.println("Saturday");
			break;
			
			case 7: System.out.println("Sunday");
			break;
			
			default: System.out.println("invalid day");
			
		}
		
		char ch = 'c';
		
		switch(ch) {
			case 'b': {
				System.out.println("char is b");
				break;
			}
			case 'a': {
				System.out.println("char is a");
				break;
			}
			default: System.out.println("char is neither a nor b");
		}
		
	}
}
