package com.blmstrm.ocjp;

/*1. Import other Java packages to make them accesible in your code*/
import java.util.ArrayList;

public class ExamReadinessCheck{

				private int integerOne = 3;
				private int integerTwo = 4;

				/*24. Differentiate between default and user-defined constructors*/
				/*18 Use super and this to access objects and constructors*/
				public ExamReadinessCheck(){
								this(1,2);
				}


				/*20. Create and overload constructors*/
				/*19. Create methods with arguments and return values*/
				public ExamReadinessCheck(int intOne, int intTwo){

								/*3. Create if and if/else constructs*/
								if(intOne == 1){
												this.integerOne = 1;
								}

								if(intTwo == 2){
												this.integerTwo = 2;
								}else{
												this.integerTwo = 1;
								}
				}

				/*4. Create and use a switch statement.
					Java 7 permits switch statements with the String object.*/
				public void useASwitchStatement(String str){

								switch(str){
												case "case1": System.out.println("Case one.");
																			break;
												case "case2": System.out.println("Case two.");
																			break;
												case "case3": System.out.println("Case three.");
																			break;
												default:System.out.println("Default case.");
								}

				}

				/*5. Create and use for loops including the enhanced for loop*/
				public void createAndUseForLoops(){

								/*25. Declare,instantiate, initialize and use a one-dimensional array*/
								int [] array = {0,1,2,3,4,5,6,7,8,9};

								/*for loop*/ System.out.println("Normal for loop:");
								for(int i = 0; i<10;i++){
												System.out.println(""+i);
								}

								/*enhanced for loop*/
								System.out.println("Enhanced for loop:");
								for(int i : array){
												System.out.println(i);
								}
				}

				/*6. Create and use while loops*/
				public void createAndUseWhileLoops(){
								int i = 0;
								while(i<10)	{
												System.out.println("I have created a while loop and I am using it.");
												i++;
								}
				}

				/*7. Create and use do/while loops.
					The difference between a while loop and a do-while loop
					is that a do-while loop executes the code block at least once while the while loop doesn't not.*/
				public void createAndUseDoWhileLoops(){
								int i =0 ;
								do{
												System.out.println("I am in a while loop doing it.");
												i++;
								}while(i<10);
				}

				/*8 Use break and continue*/
				public void useBreakAndContinue(){
								int i = 0;
								int j = 0;

								while(i<-1){

												if(i==5 && j <= 3){
																j++;
																continue;
												}

												if(i==7){
																break;
												}

												i++;
								}
				}

				/*9 Use Java Operators*/
				public void useJavaOperators(){

								int a = 2;
								int b = 10;
								int sum = 0;

								sum += a;
								System.out.println(""+sum);

								sum -= b;
								System.out.println(""+sum);

								sum /= a;
								System.out.println(""+sum);

								sum *= b;
								System.out.println(""+sum);

								sum = a<b?a:b;
								System.out.println(""+sum);


								a =2 ;
								b = 10;
								sum = 0;


								/*Bitwise operations*/
								sum &= a;
								System.out.println(""+sum);

								sum |= b;
								System.out.println(""+sum);

								sum ^= a;
								System.out.println(""+sum);

								sum *= b;
								System.out.println(""+sum);

								sum <<= b;
								System.out.println(""+sum);

								/*Doesn't shift sign-bit*/
								sum >>= b;
								System.out.println(""+sum);

								/*Also shifts sign-bit*/
								sum >>>= b;
								System.out.println(""+sum);



				}

				/*10. Overriding operator precedence*/
				public void overridingOperatorPrecedence(){

								/*14. Declare and initialize variables*/
								int a = 2;
								int b = 3;
								int c = 4;

								int sum = 0;

								sum = a*(b+c);

								System.out.println(sum+"");
				}

				/*11. Create and manipulate strings*/
				public void createAndManipulateStrings(){

								String a = "String a";
								String b = "String b";

								String longerString = "This is a string a bit longer than usually.";
								String c = a+b;

								System.out.println(c);


								System.out.println(longerString.charAt(1));


								/*String.compareTo(String anotherString) returns -1 if the string is lexicographically less than the string argument, 0 if they are equal and 1 if the string is lexicographically greater than the string argument.
									String.equals(Object object) has a special block for comparing Strings. This method first check length of the string then returns true if object and the string is equal and false if they are not. If comparing longer strings it is a good idea to use String.equals(String anotherString).
								 */

								/*13. Test equality between strings and other objects using == and equals()*/
								String tmp1  = (longerString.equals("This is a string a bit longer than usually.")?"Same":"Different");
								String tmp2  = (longerString.compareTo("This is a string a bit longer than usuall")==0?"Same":"Different");

								/*Not recommended*/
								if(tmp1!=tmp2){
												System.out.println("The strings are not equal");
								}

								System.out.println(tmp1);
								System.out.println(tmp2);


								/*Strings in Java are immutable String.replace(char a, char b) generates a new String object that leaves the original longerString intact.*/
								System.out.println(longerString.replace('i','ü'));

								String [] splitString = new String [5];

								/*The value int value in String.split(Regex, int value) controls how many times the regular expression should be applied.*/
								splitString = longerString.split(" ",3);
								for(String s: splitString){
												System.out.println(s);
								}

				}

				/*12. Manipulate data using the StringBuilder class and its methods.*/
				public void createAndManipulateWithStringBuilder(){
								StringBuilder strBldr = new StringBuilder();

								strBldr.append("Test String");

								/*StringBuilder.insert(int offset, String s) takes an offset that must be greater than 0 and smaller than the length of the string.*/
								strBldr.insert(4,"Another test String");

								/*To insert a substring use StringBuilder.insert(int offset, String s, int start, int end) where offset is an offset in the target string, start is the start position in the String string and int end is the endposition.*/ 
								strBldr.insert(0,"What a wonderful day",0,4);


								System.out.println(strBldr.toString());

				}

				/*15. Differentiate between object reference variables and primitive variables*/
				public void differentiateBetweenObjectAndPrimitiveVariables(){

				}


				/*16. Define the scope of a variable*/	
				public void defineScopeOfVariable(){

								int integerOne = 1200;
								int integerTwo = 2200;


								System.out.println("Method integerOne: "+integerOne+" Method IntegerTwo: "+integerTwo);
								System.out.println("Class integerOne: "+this.integerOne+" Class integerTwo: "+this.integerTwo);
				}


				/*18. Use super and this to access objects and constructors.*/
				/*19. Create call methods with arguments and return values*/
				/*23. Create an overloaded method*/
				@Override
								public String  toString(){
												return super.toString();
								}

				/*25. Declare,instantiate, initialize and use a multi-dimensional array*/
				public void twoDarrayWork(){

								int [][] twoDArray = {{1},{2}};
								
								/*Only to show different way of declaring array*/
								@SuppressWarnings("unused")
								int [][] another2dArray = new int [1][1];

								System.out.println("Value from 2D array: "+ twoDArray[1][0]);
				}

				/*27. Declare and use ArrayList*/
				public void useArrayList(){

								/*Uses autoboxing to cast between int <-> Integer*/
								ArrayList <Integer> tmpArrayList = new ArrayList <Integer> ();

								tmpArrayList.add(1);
								tmpArrayList.add(2);

								for(int i : tmpArrayList){
												System.out.println(i);
								}
				}

				/*28. Implement inheritance*/
				/*29. Use abstract classes and interfaces*/
				/*33. Develop code that demonstrates the use of polymoprhism.*/
				/*35. Determine when casting is nescessary*/
				public void abstractClassesAndInterfaces(){

								Hunter huntingChihuahua = new Chihuahua();

								huntingChihuahua.findPray();

								((Canine)huntingChihuahua).bark();
				}

				/*36. Describe what exceptions are used for in Java*/
				public void throwCatchAndException() throws IndexOutOfBoundsException{
								int [] intArray = new int [1];
								System.out.println(intArray[1]);
				}

				/*30. Apply access modifiers*/
				public void setIntegerOne(int i){
								this.integerOne = i;
				}

				public void setIntegerTwo(int i){
								this.integerTwo = i;
				}

				public int getIntegerOne(){
								return this.integerOne;
				}

				public int getIntegerTwo(){
								return this.integerTwo;
				}
}
