package com.blmstrm.ocjp;

import java.util.Random;

public class ClassesAndVariables {

	private enum FastFoods {
		
		PIZZA(5),HOTDOG(3),HAMBURGER(10);
			
		private int toppingCount = 0;
		
		private FastFoods(int toppings){
			this.toppingCount = toppings;
		}
		
		public int getToppingCount(){
			return this.toppingCount;
		}
	
	}

	public static void main(String[] args) {

		/*All primitives in bitformat
		Boolean value: true
		Bit value: 00000000000000000000000000000001
		Char value: ␁
		Bit value: 00000001
		Char value: A
		Bit value: 0000000001000001
		Byte value: 127
		Bit value: 01111111
		Short value: 32767
		Bit value: 0111111111111111
		Integer value: 2147483647
		Bit value: 01111111111111111111111111111111
		Long value: 9223372036854775807
		Bit Value: 0111111111111111111111111111111111111111111111111111111111111111
		Float value: 3.4028235E38
		Bit Value: 01111111011111111111111111111111
		Double value: 1.7976931348623157E308
		Bit Value: 0111111111101111111111111111111111111111111111111111111111111111*/


		printBitsOfBoolean(true);

		/*Char stored as unicode in java usually demands 2 bytes/char.
		 Transforming chars to strings, depending on system encoding, use either 1 or 2 bytes. 
		 */

		/*Char stored in one byte example. Unicode 'SOH' (Start of Heading).*/
		printBitsOfChar1('\u2401');

		/*Char stored in two byte example. Unicode 'A'.*/
		printBitsOfChar2('A');

		printBitsOfByte((byte)Byte.MAX_VALUE);

		printBitsOfShort((short)Short.MAX_VALUE);

		printBitsOfInt(Integer.MAX_VALUE);

		printBitsOfLong(Long.MAX_VALUE);

		printBitsOfFloat(Float.MAX_VALUE);

		printBitsOfDouble(Double.MAX_VALUE);

		/*Starting with Java 7 _ in numbers are allowed*/
		System.out.println("\nHey! "+555_555);

		/*Print fast food enum*/
		printFastFood();

	}

	public static void printBitsOfBoolean(boolean b){

		/*As long as not boolean [] then boolean is stored in int.
		 *If boolean [] stored as 1 byte per element. */

		System.out.println("Boolean value: "+b);
		System.out.print("Bit value: ");

		int tmpi = b?1:0;

		for(int i = Integer.SIZE-1 ;i>=0;i--){
			char c =(((tmpi >> i) & 0x01) == 1)?'1':'0';
			System.out.print(c);
		}

		System.out.println();

	}

	public static void printBitsOfChar1(char c){

		/*Char is same size as 2 bytes*/
		System.out.println("Char value: "+c);
		System.out.print("Bit value: ");

		for(int i = Byte.SIZE-1;i>=0;i--){
			char d =(((c >> i) & 0x01) == 1)?'1':'0';
			System.out.print(d);
		}

		System.out.println();

	}

	public static void printBitsOfChar2(char c){

		/*Char is same size as 2 bytes*/
		System.out.println("Char value: "+c);
		System.out.print("Bit value: ");

		for(int i = Byte.SIZE*2-1;i>=0;i--){
			char d =(((c >> i) & 0x01) == 1)?'1':'0';
			System.out.print(d);
		}

		System.out.println();

	}

	public static void printBitsOfByte(byte b){

		System.out.println("Byte value: "+b);
		System.out.print("Bit value: ");

		for(int i = Byte.SIZE-1 ;i>=0;i--){
			char c =(((b >> i) & 0x01) == 1)?'1':'0';
			System.out.print(c);

		}

		System.out.println();

	}

	public static void printBitsOfShort(short s){

		System.out.println("Short value: "+s);
		System.out.print("Bit value: ");

		for(int i = Short.SIZE-1 ;i>=0;i--){
			char c =(((s >> i) & 0x01) == 1)?'1':'0';
			System.out.print(c);
		}

		System.out.println();

	}

	public static void printBitsOfInt(int n){

		System.out.println("Integer value: "+n);
		System.out.print("Bit value: ");

		for(int i = Integer.SIZE-1 ;i>=0;i--){
			char c =(((n >> i) & 0x01) == 1)?'1':'0';
			System.out.print(c);
		}

		System.out.println("");

	}

	public static void printBitsOfLong(long l){

		System.out.println("Long value: "+l);
		String tmpString = Long.toBinaryString(l);
		System.out.print("Bit Value: ");
		System.out.println(String.format("%"+Long.SIZE+"s",tmpString).replace(' ','0'));

	}

	public static void printBitsOfFloat(float f){

		System.out.println("Float value: "+f);

		/*Need to find out  sign this way, somehow that bit is not printed below*/
		char sign = ((Float.floatToRawIntBits(f)>>>Float.SIZE-1) & 1) != 0?'1':'0';

		String tmpString = Integer.toBinaryString(Float.floatToRawIntBits(f));
		System.out.print("Bit Value: ");
		System.out.println(sign+tmpString);

	}

	public static void printBitsOfDouble(double d){

		System.out.println("Double value: "+d);

		/*Need to find out sign this way, somehow that bit is not printed below*/
		char sign = ((Double.doubleToLongBits(d)>>>Long.SIZE-1) & 1) != 0?'1':'0';

		String tmpString = Long.toBinaryString((Double.doubleToRawLongBits(d)));
		System.out.print("Bit Value: ");
		System.out.println(sign+tmpString);

	}

	public static void printFastFood(){
		
		Random randomFoodGenerator = new Random();
		int kindsOfFood = FastFoods.values().length;
		FastFoods randomFood = FastFoods.values()[randomFoodGenerator.nextInt(kindsOfFood)];
		System.out.println("I like a "+randomFood+" with "+randomFood.getToppingCount()+" kinds of topping.");
	
	}
	

}

