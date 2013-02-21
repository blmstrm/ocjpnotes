package com.blmstrm.ocjp;

public class ClassesAndVariables {

	public static void main(String[] args) {

		/*All primitives in bitformat*/
		
		printBitsOfBoolean(true);
		
		/*Unicode encoding corresponding to Start Of Heading(SOH) symbol*/
		printBitsOfChar('\u2401');
		
		printBitsOfByte((byte)Byte.MAX_VALUE);
		
		printBitsOfShort((short)Short.MAX_VALUE);
		
		printBitsOfInt(Integer.MAX_VALUE);
		
		printBitsOfLong(Long.MAX_VALUE);
		
		printBitsOfFloat(Float.MAX_VALUE);
		
		printBitsOfDouble(Double.MAX_VALUE);

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

	public static void printBitsOfChar(char c){

		/*Char is same size as byte*/
		System.out.println("Char value: "+c);
		System.out.print("Bit value: ");
		
		for(int i = Byte.SIZE-1;i>=0;i--){
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

}

