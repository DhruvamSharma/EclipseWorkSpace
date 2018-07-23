package com.fil.junit.JUnitTesting;

import java.math.BigInteger;

/**
 * Hello world!
 *
 */
public class App {

	public void multiply() {
		BigInteger integer1 = BigInteger.valueOf(976452739);
		BigInteger integer2 = BigInteger.valueOf(9999999);

		BigInteger integer = integer1.multiply(integer2).multiply(integer2);

	}

}
