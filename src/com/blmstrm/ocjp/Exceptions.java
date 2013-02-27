package com.blmstrm.ocjp;

public class Exceptions {

	public static void main(String[] args) {

		/*Try with resources*/
		try(CustomClosable tmpClosable = new CustomClosable()){
				tmpClosable.printSomething();
		}catch(Exception e){
			System.err.println("Oops, I caught an exception.");
		}
	}
	
	static class CustomClosable implements AutoCloseable{

		@Override	
		public void close() throws Exception {
			// TODO Auto-generated method stub
			System.out.println("I'm closed.");	
		}

		public void printSomething(){
				System.out.println("Something");
		}

	}

}
