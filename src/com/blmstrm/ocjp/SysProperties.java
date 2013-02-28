package com.blmstrm.ocjp;

import java.util.Properties;

public class SysProperties {

	public static void main(String[] args) {

		/*Changed or customized with the -Dkey=value switch to the Java application launcher*/
		Properties currentProps = System.getProperties();

		/*Takes stream as argument*/
		currentProps.list(System.out);
	}

}
