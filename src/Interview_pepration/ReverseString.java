package Interview_pepration;

public class ReverseString {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		String str= "java";
//		String rev="";
//		
//		for(int i = str.length()-1;i>=0;i--) {
//			
//			
//			//str.length  = 4  i = 4  reture the number in string   :- j a v a
//			//str.length() - 1         3,2,1,0      Index         :-   0 1 2 3 
//			//  4-1= 3  now index is i =  3,2,1,0
//			now i = 3 ,2,1,0
//			int i >=0    this is  loop condition
//			
//			
//			int i = 3    start from the  last charater			
//			i become -1 loop stop 
//			
//			
//		}
//		
//	
//	
//	}
//Method --------1  String Builder
	
	public static void main(String[] args) {
        String str = "hello";

        String reversed = new StringBuilder(str).reverse().toString();

        System.out.println(reversed);
    }
	
	
// Using loop
	
	public static void main(String[] args) {
        String str = "hello";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println(reversed);
    }
	
	
	// Using char Array
	
	 public static void main(String[] args) {
	        String str = "hello";

	        char[] chars = str.toCharArray();

	        for (int i = chars.length - 1; i >= 0; i--) {
	            System.out.print(chars[i]);
	        }
	    }
	
}
