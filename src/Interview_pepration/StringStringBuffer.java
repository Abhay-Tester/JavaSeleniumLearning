package Interview_pepration;

public class StringStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String s = "hello";
//		System.out.println(s);
//		s=s+ "world";
//		System.out.println(s);
		
		
		
		
		// Here no need to create new object to update old string
//		StringBuffer sd = new StringBuffer("My name is");
//		System.out.println(sd);
//		sd.append(" abhay");
//		System.out.println(sd);
		
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < 1000; i++) {
		    sb.append(i);
		    System.out.println(i);
		    
		    
//		    StringBuffer vs StringBuilder
//
//		    Modern Java code often uses StringBuilder instead of StringBuffer because:
//
//		    StringBuilder is also mutable.
//		    It is not synchronized, so it is usually faster in single-threaded applications.
//		    StringBuffer should be used when multiple threads need to safely modify the same buffer.
		    
		    
		}
	}

}
