package Interview_pepration;

public class ReverseStringloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String	str = "Abhay";
	String  rev = "";
	
	for(int i = str.length()-1;i>=0;i--) {
		rev += str.charAt(i);
		
		
	}
	System.out.println(rev);
		
	}	
	


}
