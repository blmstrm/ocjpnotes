package com.blmstrm.ocjp;
import com.blmstrm.ocjp.ClassesAndVariables;

public class BitOps{

	public static void main(String[] args) {
		leftBitShift();
		rightBitShift();
		rightRightBitShift();
	}

	/* Equals right-side operand*2 */
	static public void leftBitShift(){
		System.out.println(8<<1);
	}

	/* Equals left-side operand/2 */
	static public void rightBitShift(){
		System.out.println(-8>>1);
	}

	/* Becomes 2147483644 due to the fact that the 1 used as sign describing bit
	  is moved to the neighboring spot to the right.*/
	static public void rightRightBitShift(){
		System.out.println(-8>>>1);
	}

}