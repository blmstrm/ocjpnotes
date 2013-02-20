package com.blmstrm.ocjp;

public class OperatorsAndStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		AssignmentStatements();

		stringBuilderExamples();

		instanceComparsionVsObjectComparsion();
	}

	private static void instanceComparsionVsObjectComparsion() {
	
		String string1 = new String ("Howdy!");
		String string2 = string1;
		String string3 = new String ("Partner!");
		
		System.out.println("String1 "+string1);
		System.out.println("String2 "+string2);
		System.out.println("String3 "+string3);
		
		
		if(string1 == string2){
			System.out.println("String 1 & String 2 are referencing the same instance of the string "+string2);
		}
		if(!string3.equals(string1)){
			System.out.println("String 1 & String 3 are not equal objects because string1="+string1+" and string3="+string3);
		}
		
	}

	public static void AssignmentStatements(){
		byte a;
		a = 10;
		System.out.println(a+" /= 3:"+(a /= 3));
		a = 15;
		System.out.println(a+" %= 3:"+(a %= 3));
		a = 20;
		// & bitwise AND
		System.out.println(a+" &= 3:"+(a &= 3));
		a = 30;
		// ^ bitwise exclusive OR, 1 0 = 1, 0 1 = 1 everything else is 0
		System.out.println(a+" ^= 3:"+(a ^= 3));
		a = 35;
		// | bitwise inclusice OR, 1 0 = 1, 0 1 = 1, 1 1 = 1
		System.out.println(a+" |= 3:"+(a |= 3));
		a = 40;
		//TODO
		System.out.println(a+" <<= 3:"+(a <<= 3));
		a = 45;
		//TODO
		System.out.println(a+" >>= 3:"+(a >>= 3));
		a = 50;
		//TODO
		System.out.println(a+" >>>= 3:"+(a >>>= 3));
		a = 55;
	}

	public static void stringBuilderExamples(){

		StringBuilder strBuilder1 = new StringBuilder();
		boolean test = true;
		strBuilder1.append(test);
		System.out.println(strBuilder1);

		StringBuilder strBuilder2 = new StringBuilder("Test");
		System.out.println(strBuilder2);		

		StringBuilder strBuilder3 = new StringBuilder(4);
		strBuilder3.append(false);
		System.out.println(strBuilder3);


		CharSequence charSeq = new CharSequence() {

			char [] chars = {'t','e','s','t'};

			@Override
			public CharSequence subSequence(int start, int end) {
				// TODO Auto-generated method stub

				if( start>=0 && end>=0 && start < chars.length && end < chars.length){
					
					char [] returnSeq = new char [end-start+1];
					int counter = 0;
	
					for(;start<=end;){
						returnSeq[counter++] = chars[start++];
					}

					return java.nio.CharBuffer.wrap(returnSeq);
				}
				return null;
			}

			@Override
			public int length() {
				// TODO Auto-generated method stub
				return chars.length;
			}

			@Override
			public char charAt(int index) {
				// TODO Auto-generated method stub
				return chars[index];
			}
		};

		StringBuilder strBuilder4 = new StringBuilder(charSeq);
		System.out.println(strBuilder4);
		System.out.println(charSeq.subSequence(2,3));

	}

}
