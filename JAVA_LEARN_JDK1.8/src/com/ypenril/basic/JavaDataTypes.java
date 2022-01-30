package com.ypenril.basic;

/*
*@Author: Yeat Nai Cheng
*@Created Date:18 Dec 2021
*
*/
public class JavaDataTypes {
	public static void main(String[] args) {
		/* ABOUT BYTE */
		// Byte hold whole number between -128 and 127
		System.out.println("BYTE");
		byte byteNum = 112;
		System.out.println("This is byte: " + byteNum);

		// Byte Problem 1
		System.out.println("BYTE PROBLEM 1");
		byteNum = (byte) (byteNum + 40);
		System.out.println("The answer suppose to be: " + "152");
		System.out.println("Actual answer: " + byteNum);

		// Byte Trick 1
		System.out.println("BYTE TRICK 1");
		byte byteNumTrick1 = 112;
		// Trick 1.1 When combine string and addition of byte in print, it will
		// recognise those adding
		// as combine string
		System.out.println("Trick 1.1: " + byteNumTrick1 + 40);
		// Trick 1.2 When do addition directly in print, it will add both byte and the
		// other given number.
		// In this case it will be turned into integer when adding and hence the
		// limitation of byte does not limit.
		System.out.print("Trick 1.2: ");
		System.out.println(byteNumTrick1 + 40);

		/* ABOUT SHORT */
		// Short greater than byte in terms of size and less than integer. Its range is
		// -32,768 to 32767.
		// Default size of this data type: 2 byte
		System.out.println("\nSHORT");
		short shortNum = 23456;
		System.out.println("This is short: " + shortNum);

		// Short Problem 1
		System.out.println("SHORT PROBLEM 1");
		System.out.println("The answer suppose to be: " + "33456");
		shortNum = (short) (shortNum + 10000);
		System.out.println("Actual answer: " + shortNum);
	}
}
