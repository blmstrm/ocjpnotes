package com.blmstrm.ocjp;

import java.util.ArrayList;

public class Arrays {

	public static void main(String[] args) {
	
	copyAnArray();
	arrayListOp();
	}
	
	public static void copyAnArray(){
		
		int [] arrayOne ={1,2};
	
		int [] arrayTwo = new int [2];
		
		System.arraycopy(arrayOne, 0, arrayTwo, 0,2);
		
		System.out.println(arrayTwo[1]);
	
	}
	
	public static void arrayListOp(){
		ArrayList <Integer> tmpArray = new ArrayList <Integer>(1);
		tmpArray.ensureCapacity(2);
		
		System.out.println("Size of the array: "+tmpArray.size());
		
		tmpArray.add(new Integer(1));
		tmpArray.add(new Integer(2));
		tmpArray.add(new Integer(3));
		
		System.out.println("Hej"+true);
	}
	
}
