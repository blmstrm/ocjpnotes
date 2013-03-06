package com.blmstrm.ocjp;

public abstract class Canine{

				private String kingdom = "Animalia";
				private String countryOfOrigin = "";

				public Canine(String cOfo){
					this.countryOfOrigin = cOfo;
				}
				

				public abstract void bark();

				public String getCountryOfOrigin(){
								return this.countryOfOrigin;
				}

				public String getKingdom(){
								return this.kingdom;
				}
}
