package com.blmstrm.ocjp;

public class Arrays {

	public static void main(String[] args) {
	
	copyAnArray();
		
	}
	
	public static void copyAnArray(){
		
		int [] arrayOne ={1,2};
	
		int [] arrayTwo = new int [2];
		
		System.arraycopy(arrayOne, 0, arrayTwo, 0,2);
		
		System.out.println(arrayTwo[1]);

	}
	
}
