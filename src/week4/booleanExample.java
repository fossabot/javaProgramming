package week4;

public class booleanExample {
	
	public static void main(String[] args) {
	
		/**
		 *  boolean 변수 타입은 true(1) 또는 false(0) 값만 받습니다.
		 *  */
		
		int number = 4;
		
		boolean isPositive = (number > 0);
		if ( isPositive )
		System.out.println("The number is positive.");
		else
		System.out.println("The number is negative or zero.");
	}
	
}
