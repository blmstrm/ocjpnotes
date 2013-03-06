package com.blmstrm.ocjp;

public class Chihuahua extends Canine implements Hunter{

	public Chihuahua(){

		super("Mexico");
	}

	public void findPray(){
		System.out.println("I found a pigeon.");
	}

	public String getCaughtPrey(){
		return "Pigeon";
	}

	public void bark(){
		System.out.println("squeaksqueak");
	}
}
