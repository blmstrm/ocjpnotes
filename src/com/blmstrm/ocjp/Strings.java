public class Strings {
/*StringBuffer and StringBuilder are very similar except the fact that StringBuffer is thread-safe while StringBuilder is not.*/
				private static	StringBuilder a =  new StringBuilder("Du gamla.");
				private static	StringBuilder b = new StringBuilder("Du fria.");           	
				private static	StringBuilder c = new StringBuilder("Du fjällhöga nord.");

				public static void main(String[] args) {
								testStringBuilder();
				}

				private static void testStringBuilder(){

								char [] testArray = {'A','B','C','D'};

								/*Appending char [] needs offset value and lenght*/	
								b.append(testArray,2,2);
								print("Append char []");			

								/*Appending member that implements CharSequence interface (String/StringBuilder/StringBuffer) only needs
									int start and int end*/
								a.append(c,2,4);
								print("Append charsequence");			

								/*It is possible to append any primitive to StringBuilder*/
								boolean appendable = false;
								c.append(appendable);
								print("Append boolean");

								/*Inserting works similarly to append, an offset longer that the string will cause a StringIndexOutOfBoundsException*/
								try{
												c.insert(25,"Trouble string");
								}catch(StringIndexOutOfBoundsException sioobe){
												System.err.println("\nI caught an exception. You are out of bounds.");
								}

								/*There is also a method to insert a substring into a StringBuilder object with offset o,  ranging from int start to int end in source string*/
								/*Offset 3, start at position 0 and stop at position 5 in StringBuilder c.*/
								a.insert(3,c,0,5);
								print("Inserting with offset and substring definition in method call.");


								/*To remove characters StringBuilder has the delete method and replace method and replace method*/
								/*StringBuilder.replace can't take a CharSequence instance only a String object.*/
								/*Replace method takes arguments as int start and int end, where the character at end position is not included in the substring.*/
								a.delete(2,7);
								a.replace(2,3," ");
								a.delete(a.length()-2,a.length());
								b.delete(b.length()-2,b.length());
								c.reverse().replace(0,5,"eurt").reverse();
								print("Delete and Replace");

				}

				private static void print(String actionTaken){
								System.out.println("\nPrinting after "+actionTaken+".");

								System.out.println(a);
								System.out.println(b);
								System.out.println(c);
				}
}
