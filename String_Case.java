package week3.day1;

public class String_Case {

	public static void main(String[] args) {
		String str1 = "I am Learning Java" ;
		String str2 = "I am learning Java" ;
		
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("Equal");
			
		}
		else {
			System.out.println("Not_equal");
		}
		
		if (str1==str2) {
			System.out.println("Equal");
			
		}
		else {
			System.out.println("Not_equal");
		}
		
		if (str1.equals(str2)) {
			
			System.out.println("Equal");
			
		}
		
		else {
			System.out.println("Not_equal");
		}

	}

}
