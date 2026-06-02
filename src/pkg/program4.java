package pkg;

public class program4 {
	public static void main(String[] args)
	{
		String s1 = new String();
		System.out.println("Empty String : " + s1);
		String s2 = new String("Hello");
		System.out.println("String Literals is " + s2);
		char ch[] = {'J', 'A', 'V', 'A'};
		String s3 = new String(ch);
		System.out.println("Character String is " + s3);
		String s4 = new String(ch, 1, 2);
		System.out.println("The Part of the string from 1 to 2 index is " + s4);
		byte[] b = {65, 66, 67, 68};
		String s5 = new String(b);
		System.out.println("The Byte String is " + s5);
		String s6 = new String(s2);
		System.out.println("The Copied String is " + s6);
		int num = 10;
		double D = 90.99;
		boolean Boolean = true;
		String s7 = String.valueOf(num);
		String s8 = String.valueOf(D);
		String s9 = String.valueOf(Boolean);
		System.out.println("The String after After ValueOf(int) " + s7);
		System.out.println("The String After ValueOf(D) is " + s8);
		System.out.println("The String After ValueOf(Boolean) " + s9);
		String concat1 = s2 + " World";
		System.out.println("The String After concat1 is " + concat1);
		String concat2 = s2.concat(" Java");
		System.out.println("The String After Concat2 is " + concat2);
	}
}
