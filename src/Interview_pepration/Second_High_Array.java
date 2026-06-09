package Interview_pepration;

public class Second_High_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]arr = {10, 5, 20, 8, 15};
		
		int first = Integer.MIN_VALUE;
		int second= Integer.MIN_VALUE;
		
		for(int num : arr) {
			
			if(num>first) {
               second= first;
               first= num;
               
			}else if (num>second && num!= first) {
				second= num;
			}
		}
			System.out.println("secound high number :-  "+second);
		}
		
	}


