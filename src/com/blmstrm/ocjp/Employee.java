package com.blmstrm.ocjp;


public class Employee{

	private static Employee instance = null;

	private String name;
	private int zip;
	private int age;

	
	//Initialization block
	{
		System.out.println("Creating static Employee");
	}
	
	private Employee(String name) {
		this(name,17166,31);
	}

	private Employee(String name, int zip) {
		this(name,zip,31);
	}

	private Employee(String name, int zip, int age) {
		this.name = name;
		this.zip = zip;
		this.age = age;
	}

	public static Employee getInstance(String s){
		if(instance == null){
			instance = new Employee(s);
		}else{
			instance.setName(s);
		}
		
		return instance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	@Override
	public String toString(){
	
		return "Employee name: "+name+" \nEmployee zip: "+zip+" \nEmployee age: "+age;
	}


}
