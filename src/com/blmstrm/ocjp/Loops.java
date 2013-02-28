package com.blmstrm.ocjp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {

		System.out.println("Total is: "+total(1,2,3,4,5));
		System.out.println("Total is: "+total(2));

		doWhile();
		
		listIteration();
		
	}

	/*Variable number of arguments*/
	public static int total(int ... array){
		int sum = 0;

		if(array != null){
			for(int number : array){
				sum+=number;
			}
		}
		return sum;
	}

	public static void whileLoops(){
		int i = 5;
		int j = 10;
		while(i < j){}

		/*(Assignment) Comparsion*/
		while((i = 7 ) != 6){}
	
		do{
			
		}while(i < 5);
	}

	public static void listIteration(){
		
		ArrayList<String> testList = new ArrayList<String>();
		testList.add("A");
		testList.add("B");
		testList.add("C");
		
		Iterator<String> iterato = testList.iterator();
		
		System.out.println("Iterating through list.");
		
		while(iterato.hasNext()){
			System.out.println(iterato.next());
		}
	}
	
	public static void doWhile(){
		int sum = 0;
		int number;
		boolean caughtExcep = false;

		System.out.println("Loop breaks at negative integer input.");

		do {
			/*try-with-resources*/
			try(Scanner scanner = new Scanner(System.in)){
				
				System.out.print("Enter a number: ");
				number = scanner.nextInt();

				if(number > 0){
					sum += number;
				}

			}catch(Exception e){
				System.out.println("You need to input a number.");
				caughtExcep = true;
				break;
			}
		}while (caughtExcep || number >= 0);

		if(!caughtExcep){
			System.out.println("The sum is: "+sum);
		}
		
	}

}
