package Day3;

public class OperatorDemo {

	public static void main(String[]args) {
		
//	1) Arthemetic Operators  + _* ?%
		
		
		int a=20 , b=10;
		
		int result = (a+b);
		System.out.println("sum of a and b" + (a+b));
		System.out.println("minusmul of a and b" + (a-b));
		System.out.println("multi of a and b" + (a*b));
		System.out.println("divi of a and b" + (a/b));
		System.out.println("sum of a and b" + (a%b));
		
		System.out.println(result);
		
		
//		2)Relational / Comparison operators    >  >=  <  <=  !=  ==
		
		
		System.out.println(a>b); //true
		System.out.println(a<b);   //flase
System.out.println(a==b);   // false		
		
System.out.println(a>=b);
System.out.println(a<=b);


      b = 20;
      System.out.println(a<=b);
      System.out.println(a>=b);

      System.out.println(a!=b);  //  not equalfalse
      
      System.out.println(a==b);  //false

      boolean res =a>b;
      System.out.println(res);

// use between to variable
      System.out.println("-------------- Logical operates");
      // logical operaters use  in only boolen data types
      // Logical operaters  && and,  || or,    ! not
      // reture boolen value  - true/ false
      
      // worked between two boolen value
      
      
    
      boolean x  = true;
      boolean  y = false;
       
      System.out.println(x && y);  //false
      System.out.println(x || y);  // ture
      
      System.out.println(!x);  //false
      System.out.println(!y);  // ture
      
  boolean b1= 10>20;
  System.out.println("b1 :- "+ b1);
      

  boolean b2= 10<20;
  System.out.println("b2 :- "+ b2);
   
// Now use logical operater 
  System.out.println("-------------- Logical operater example");
  System.out.println(b1 && b2);

  System.out.println(b1 || b2);

  System.out.println(b1 && b2);


	}
	
}
