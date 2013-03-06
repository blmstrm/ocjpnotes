package com.blmstrm.ocjp;
public class MainExam{

				/*22. Apply the static keyword to methods and fields*/
				private static int staticInt = 0;

				/*2. Create executable Java applications with a main method*/
				public static void main(String [] args){

								ExamReadinessCheck tmpCheck = new ExamReadinessCheck();

								/*21 Call method on objects*/
								tmpCheck.useASwitchStatement("case2");

								tmpCheck.createAndUseForLoops();

								tmpCheck.setIntegerOne(2);
								tmpCheck.setIntegerTwo(1);

								System.out.println("Printing integer one: "+tmpCheck.getIntegerOne());
								System.out.println("Printing integer two: "+tmpCheck.getIntegerTwo());

								tmpCheck.createAndUseWhileLoops();
								tmpCheck.createAndUseDoWhileLoops();

								tmpCheck.useBreakAndContinue();

								tmpCheck.useJavaOperators();
								tmpCheck.overridingOperatorPrecedence();

								tmpCheck.createAndManipulateStrings();

								tmpCheck.createAndManipulateWithStringBuilder();

								tmpCheck.defineScopeOfVariable();

								tmpCheck.twoDarrayWork();

								tmpCheck.useArrayList();

								tmpCheck.abstractClassesAndInterfaces();

								/*38. Create a try-catch block and determine how exceptions alter normal program flow*/
								/*39. Invoke a method that throws an exception.*/
								try{
												tmpCheck.throwCatchAndException();
								}
								catch (IndexOutOfBoundsException iobe){
												System.out.println("Caught index out of bounds exception.");
												System.out.println(iobe);
								}finally{
												System.out.println("Finally exiting");
								}


				}


				/*22. Apply the static keyword to methods and fields*/
				public static void increaseAndPrintStaticInt(){
								staticInt++;
								System.out.println("Printing static int: "+staticInt);
				}
}
