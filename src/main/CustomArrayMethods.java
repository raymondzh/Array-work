package main;

import java.util.Scanner;

public class CustomArrayMethods 
{
	
	
	public static void populateRandomly(int[] array, int max)
	{
		for(int i = 0; i < 100;i++)
		{
			array[i] = Utility.random(0, max);
		}
	}
	
	public static void populateAscending(int[] array)
	{
		for(int i = 0; i < 100; i++){
			array[i] = i+1;
		}
	}
	
	public static void printArray(int[] array)
	{
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				if(String.valueOf(array[10*i+j]).length() == 3)
					System.out.print(array[10*i+j] + " ");
				else if (String.valueOf(array[10*i+j]).length() == 2)
					System.out.print(" " + array[10*i+j] + " ");
				else if (String.valueOf(array[10*i+j]).length() == 1)
					System.out.print("  " + array[10*i+j] + " ");
			}
			System.out.println("");
		}
	}
	
	public static void shuffle(int[] array)
	{
		int replace, replacer;
		for(int i = 0; i < 100; i++)
		{
			replacer = array[i];
			replace = Utility.random(0, 99);
			array[i] = array[replace];
			array[replace] = replacer;
		}
	}
	
	public static void lookForNumber(int[] array, Scanner in)
	{
		System.out.println("What number are you looking for?");
		int test = Utility.checkError(0, 2147483647, in);
		for(int i = 0; i < 100; i++){
			if(array[i] == test){
				System.out.println(i+1);
				break;
			}
			else if(i == 99){
				System.out.println("-1");
			}
		}
	}
	
	public static boolean checkForAscending(int[] array)
	{
		for(int i = 0; i < (array.length-1); i++)
		{
			if(array[i] < array[i+1])
			{}
			else
			{
				return false;
			}
		}
		return true;
	}
	
	public static void shuffleUntilAscending(int[] array)
	{
		for(int i = 0; i < 10000; i++)
		{
			if(checkForAscending(array))
			{
				break;
			}
			shuffle(array);
		}
	}
	
	public static int findLowestValue(int[] array)
	{
		int test = array[0];
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] < test)
			{
				test = array[i];
			}
		}
		return test;
	}
	
	public static int findHighestValue(int[] array)
	{
		int test = array[0];
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] > test)
			{
				test = array[i];
			}
		}
		return test;
	}
	
	public static int findNumberInstances(int[] array, Scanner in)
	{
		System.out.println("What integer would you like to find");
		int test = Utility.checkError(0, in);
		int instances = 0;
		for(int i = 0; i < 100; i++){
			if(test == array[i]){
				instances ++;
			}
		}
		return instances;
	}
	
	public static int findGreatestTenSum(int[] array)
	{
		int test = array[0] + array[1] + array[2] + array[3] + array[4] + array[5] + array[6] + array[7] + array[8] + array[9];
		for(int i = 0; i < 90; i++){
			if(test < array[i] + array[i+1] + array[i+2] + array[i+3] + array[i+4] + array[i+5] + array[i+6] + array[i+7] + array[i+8] + array[i+9]){
				test = array[i] + array[i+1] + array[i+2] + array[i+3] + array[i+4] + array[i+5] + array[i+6] + array[i+7] + array[i+8] + array[i+9];
			}
		}
		return test;
	}
}
