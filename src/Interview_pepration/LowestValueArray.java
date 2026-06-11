package Interview_pepration;

public class LowestValueArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {8,5,20,10,15};

		int Low = Integer.MAX_VALUE;
		for(int num:arr) {
			
			if(num<Low) {
				Low=num;
			}
		}
		System.out.println(Low);
	}

}
