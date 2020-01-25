package lv.renate.learnstring;

public class TestStringClass {

	
	public static void main(String[] args) {
		String str = "     Ind   ex";
		String strClass = new String(str);
		
		System.out.println(str);
		System.out.println("Strng like obj: "+strClass);
		
		int stringLenght = str.length();
		System.out.println(stringLenght); 
		
		System.out.println(str.charAt(3));
		
		System.out.println(str.toLowerCase());
		
		System.out.println(str.toUpperCase());
		
		System.out.println(str.trim());
		
		System.out.println(str.replace(" ", ""));
		
		
		
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "Not Hello";
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s1);
		System.out.println(s1 == s3);
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(!s1.equals(s2));
		System.out.println(!s2.equals(s3));
		
	}

}