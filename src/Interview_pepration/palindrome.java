package Interview_pepration;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String  front = "MaM";
		String  Back  ="";
		
		for(int i= front.length()-1;i>=0;i--) {
			 Back+= front.charAt(i);
		}
		System.out.println(Back);
		
		String output = (front.equals(Back))? "Palindrome" : "Not Palindrome";
System.out.println("String is :- "+output);
	}
  

}
