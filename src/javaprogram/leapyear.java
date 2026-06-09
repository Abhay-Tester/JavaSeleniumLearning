package javaprogram;

import java.util.Scanner;

//4
//100
//400
public class leapyear {

	public static boolean isleapyear(int year) {
		
		if((year % 4 ==0 && year%100 !=0) || (year % 400 == 0)) {
			
			return true;
			
		}
		else {
			return false;
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
	int year = scanner.nextInt();
	
	if(isleapyear(year)) {
		System.out.println("Is leapyear");
		
	}
	else {System.out.println("not leapbyear");}
	}

}
