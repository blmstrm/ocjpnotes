package com.blmstrm.ocjp;

public class Classes {

	
//Initialization order
//	1.	 The zeroing of fields performed when the object is instantiated
//	2.	 The initialization of final and static variables
//	3.	 The assignment of instance variables initializers
//	4.	 The execution of initialization blocks
//	5.	 The code within a constructor

		
	public static void main(String[] args) {
	
		Employee kalle = Employee.getInstance("kalle");
		
		System.out.println(kalle.toString());
		
		Employee johan = Employee.getInstance("johan");

		johan.setAge(29);
			
		System.out.println(johan.toString());
		
		if(kalle.equals(johan)){
			System.out.println("Kalle equals Johan.");
		}
		
	}
	

}
