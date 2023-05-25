/*
 * I declare that this code was written by me. 
 * I do not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: naoto
 * Student ID: {type your id here}
 * Class: {type your class here}
 * Date/Time created: Thursday 25-05-2023 11:16
 */

/**
 * @author naoto
 *
 */
import java.lang.Math;
public class Calculator {
	public int add(int a,int b , int c) {
		return a+b+c;
	}
	public int subtract(int a , int b) {
		return a-b;
	}
	public int multiply(int a , int b) {
		return a*b;
	}
	public int devide(int a , int b) {
		
		 if (b == 0) {
			System.out.print("DENOMINATOR CAN'T BE 0!");
			b = 1;
		}
		 else {
			 return a/b;
		 }
		 return a/b;
		
		
	}
	
}
