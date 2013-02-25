package com.blmstrm.ocjp;

import java.util.ArrayList;

public class MethodsAndVariableScope {

	public static void main(String[] args) {

		/*Everything in Java is pass-by-value.
		 Primitives are pass by value.
		 Objects have their references passed-by-value.
		 When passing by value something is copied, in java that
		 is object references and primitive values.
		 This is called call-by-sharing.	
		 
		 For the OCJP test simply imagine primitives passed by value
		 and objects passed by reference, even though it isn't correct.
		 p. 192 in study guide.
		  */
		
		ArrayList <Integer> masterList = new ArrayList <Integer>();

		masterList.add(new Integer(2));

		System.out.println("Original size: "+masterList.size());

		@SuppressWarnings("unused")
		DealWithArrayList copyDealer = new DealWithArrayList(new ArrayList <Integer>(masterList));

		System.out.println("Size after passed by value of object: "+masterList.size());
		
		@SuppressWarnings("unused")
		DealWithArrayList valueDealer = new DealWithArrayList(masterList);
		
		System.out.println("Size after passed by value of reference: "+masterList.size());
		
		/*Incrementing from static variable*/
		System.out.println(new staticIncrementer());

		System.out.println(new staticIncrementer());
		
	

	}

	/*Package-private access modifier (default)*/
	static class DealWithArrayList{
		
		public DealWithArrayList(ArrayList <Integer> incomingList){

			incomingList.clear();

			System.out.println("Clearing list.");
			
		}
	}
	
	static class staticIncrementer{
		private static int number = 0;
		private int myNumber;
		
		public staticIncrementer(){
			myNumber = ++number;
		}
		
		public int getMyNumber(){
			return myNumber;
		}
		
		@Override
		public String toString(){
			return "My number is "+myNumber;
		}
		
	}
	

}
