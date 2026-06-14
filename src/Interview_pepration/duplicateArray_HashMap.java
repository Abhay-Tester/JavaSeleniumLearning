package Interview_pepration;

import java.util.HashMap;

public class duplicateArray_HashMap {

public static void main(String[] args) {
	    
	    int[] arr ={1,2,1,2,3,2,1,3};
	    
	    HashMap<Integer, Integer>map= new HashMap<>();
	    
	    for(int num:arr){
	        
	        if(map.containsKey(num)){
	            map.put(num, map.get(num)+1);
	        }else{
	            map.put(num,1);
	        }
	    }
          System.out.println(map);
}
	}


