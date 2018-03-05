package main;

import java.util.Scanner;

public class MenuArray {

	public static void main(String[] args) {
		int[] array = new int[100];
		int menuSelection;
		Scanner in = new Scanner(System.in);
		int max = 100;
		int instances;
		while(true){
			instances = 0;
			System.out.println("0. Exit the program.");
			System.out.println("1. Populate the array randomly.");
			System.out.println("2. Populate the array sequentially from 1 to 100.");
			System.out.println("3. Display the Array.");
			System.out.println("4. Shuffle the Array.");
			System.out.println("5. Find first occurence of a number.");
			System.out.println("6. Check if the list is in ascending order.");
			System.out.println("7. Shuffle until ascending.");
			System.out.println("8. Find the lowest value.");
			System.out.println("9. Find the highest value");
			System.out.println("10. Find number of occurences of a number");
			System.out.println("11. Replace all instances of one number with another");
			System.out.println("12. Find ten consecutive integers with the highest sum");
			menuSelection = Utility.checkError(0, 12, in);
			
			if(menuSelection == 0){//exit
				System.out.println("Exiting");
				break;
			}
			
			else if(menuSelection == 1){//populate randomly
				CustomArrayMethods.populateRandomly(array, max);
				System.out.println("Done");
			}
			
			else if(menuSelection == 2){//populate in order
				CustomArrayMethods.populateAscending(array);
				System.out.println("Done");
			}
			
			else if(menuSelection == 3){//Print
				CustomArrayMethods.printArray(array);
				System.out.println("Done");
			}
			
			else if(menuSelection == 4){//Shuffle
				CustomArrayMethods.shuffle(array);
				System.out.println("Done");
			}
			
			else if(menuSelection == 5){//Look for place
				CustomArrayMethods.lookForNumber(array, in);
			}
			
			else if(menuSelection == 6){//Check for ascending
				System.out.println((CustomArrayMethods.checkForAscending(array)) ? "This list is in ascending order" : "This list is not in ascending order");
			}
			
			else if(menuSelection == 7){//shuffle until ascending
				CustomArrayMethods.shuffleUntilAscending(array);
				System.out.println("Done");
			}
			
			else if(menuSelection == 8){ //lowest value
				System.out.println("The lowest value is: " + CustomArrayMethods.findLowestValue(array));
			}
			
			else if(menuSelection ==9){//highest value
				System.out.println("The greatest value is: " + CustomArrayMethods.findHighestValue(array));
			}
			
			else if(menuSelection == 10){
				instances = CustomArrayMethods.findNumberInstances(array, in);
				System.out.println("That number appears " + instances + " times.");
			}
			
			else if(menuSelection == 11){
				CustomArrayMethods.findNumberInstances(array, in);
				System.out.println("Done.");
			}
			
			else if(menuSelection == 12){
				System.out.println("The greatest sum of ten consecutive numbers is: " + CustomArrayMethods.findGreatestTenSum(array));
			}
		}

	}

}

//0. Exit the program.
//
//1. Populate the array randomly.
//
//2. Populate the array sequentially from 1 to 100.
//
//3. Display the Array.
//
//4. Shuffle the Array.