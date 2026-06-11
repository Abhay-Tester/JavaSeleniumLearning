package Interview_pepration;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "java";   //original string
		String rev="";  // Empty string
//		in string   :- j a v a
//		       Index:- 0 1 2 3 
		//loop	
		for(int i = str.length()-1;i>=0;i--) {
			rev += str.charAt(i);
			
			//str.length  = 4 ,  i = 4 -1 , i = 3
			//i >=0,   3>=0 true  than execute str.charAt(i)  so str.charAt(3)
			//java
			//0123
			//str.charAt(3)= a
			// value strong in rev="a"
			
			// i-- decrement i=2  , i = 1 ,i=0, i=-1
			
			//if condition pass than put i value to chatAt
			//       3,2,1,0                 Index:- 0 1 2 3 
			//  4-1= 3  now index is i =  3,2,1,0
//			now i = 3 ,2,1,0
//			int i >=0    this is  loop condition
		
		}
		
	}
//Method --------1  String Builder
	
//	public static void main(String[] args) {
//        String str = "hello";
//
//        String reversed = new StringBuilder(str).reverse().toString();
//
//        System.out.println(reversed);
//    }
	
}
