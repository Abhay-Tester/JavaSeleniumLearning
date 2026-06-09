package Day2;

public class DataTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		//  DataType                 Size                        Description   
		//  Primetive DataType
		int a=100, b=200;           // 4 bytes
		System.out.println(+a+b);   
		System.out.println("total :- "+(a+b));
		 
		
		byte c = 125;               //1 byte                     -127 to 127
		System.out.println(c);
		
		
		short s = 32767;            //2 bytes                   -32767   to 32767
		System.out.println(s);
		
		
		long l = 12342232322453L;  //8 bytes                   -2,147,483,648 to 2,147,483,648 
		System.out.println(l);     // Literal is needed
		
		
	    // Decimal number   float double		
		
		float f = 112.799898734349f;     // 4 bytes             7 digit with decimal
		System.out.println("Flote :- "+f); // literfal is needed
		
      	double d =  23411146483.39;  // 8 bytes                 15 digit with decimal
	    System.out.println(d);
		
	    
	    boolean B = true;                                    // Store true & false value
	    System.out.println(B);                                
		
	    char garde = 'A';     //                          Store a single charater
     	System.out.println(garde);
	
	    String Name = "Abhay";
	    Name = "Toriya";
	    System.out.println(Name);
	
	
	
	
	}

}
