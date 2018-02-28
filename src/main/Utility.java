package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utility {
	public static int checkError(int min, int max, Scanner in){
		int a;
		while(true){
			try{
				 a = in.nextInt();
			}
			catch(InputMismatchException e){
				in.next();
				a = max+1;
			}
			if(a >= min && a <= max){
				return a;
			}
			else{
				System.out.println("That is not a valid input");
				System.out.println("Please try again");
			}
		}
	}
	
	public static int checkError(int min, Scanner in){
		int a;
		while(true){
			try{
				 a = in.nextInt();
			}
			catch(InputMismatchException e){
				in.next();
				a = min-1;
			}
			if(a >= min){
				return a;
			}
			else{
				System.out.println("That is not a valid input");
				System.out.println("Please try again");
			}
		}
	}
	
	public static double checkError(double min, double max, Scanner in){
		double a;
		while(true){ 
			try{
				 a = in.nextInt();
			}
			catch(InputMismatchException e){
				in.next();
				a = max+1;
			}
			if(a >= min && a <= max){
				return a;
			}
			else{
				System.out.println("That is not a valid input");
				System.out.println("Please try again");
			}
		}
	}
	
	public static int random(int min, int max){
		return (int)(Math.random() * (Math.abs(max - min) + 1) + ((max >= min) ? min : max));
	}
	
	public static int findDigitAt(int number, int place){
		return (number / (int)Math.pow(10,Integer.toString(number).length()-place-1))%10;
	}
	
	public static char getChar(Scanner in){
		return in.next().charAt(0);
		
	}
}
//Two overloaded errorTrap methods - one each for integers and doubles.
//A random number generator that takes minimum and maximum range values as parameters in any order.
//A digitAt(int number, int n) method that returns the n digit of number.
//A getChar() method that gets a char from the user and return it.


// 12098398 8 3