package javaprogram;

public class reversedString {                                   // Define Class

	public static void main(String[] args) {                    //Main methoad create variable2
		
		String original = "Abhay";
		String reversed = reverseString(original);
	System.out.println("original :- " + original);
	System.out.println("Reversed :- " + reversed);
	
	}
	

	public static String reverseString(String str) {            // Method of reversed String
	StringBuilder reversed = new StringBuilder();
	for(int i = str.length() -1; i>=0; i--) {
		
		reversed.append(str.charAt(i));
	}
	
	return reversed.toString();
	}


}
