package Basics;

public class DataTypes {

	public static void main(String[] args) {
		
		byte by = 10;
		short sh = 10;
		int in = 10;
		long ln = 10;
		
//		by = sh;
//		by = in;
//		by = ln;

		sh = by;
//		sh = in;
//		sh = ln;
		
		in = by;
		in = sh;
//		in = ln;
		
		ln = by;
		ln = sh;
		ln = in;
		
		by = 10;
		by = 127;
//		by = 128;
		by = (byte)300;
		System.out.println(by);
		
		float fl = 25.1f;
		System.out.println(fl);
		double db = 25.1131232342432432;
		
		char ch = 'a';
		ch = 98;
		System.out.println(ch);
//		System.out.println((int)'A');
		
		System.out.println('a' - 'b');
		
		char ch2 = '9';
		System.out.println((int)ch2);
		
		boolean bool = false;
		System.out.println(bool);
	}

}
