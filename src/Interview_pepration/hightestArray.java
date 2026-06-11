package Interview_pepration;

public class hightestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {8,5,20,10,15};
	   int  first = Integer.MIN_VALUE;	
	
		for(int num:arr) {
			
			if(num>first) {
				first=num;
			}
		}
		System.out.println(first);
	}

}
