package main;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MenuArray {

	public static void main(String[] args) {
		int[] array = new int[100];
		int menuSelection;
		Scanner in = new Scanner(System.in);
		int test;
		int max = 100;
		boolean ascending = true;
		while(true){
			test = 0;
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
			menuSelection = Utility.checkError(0, 9, in);
			
			if(menuSelection == 0){//exit
				System.out.println("Exiting");
				break;
			}
			
			else if(menuSelection == 1){//populate randomly
				for(int i = 0; i < 100;i++){
					array[i] = Utility.random(0, max);
				}
				System.out.println("Done");
			}
			
			else if(menuSelection == 2){//populate in order
				for(int i = 0; i < 100; i++){
					array[i] = i+1;
				}
				System.out.println("Done");
			}
			
			else if(menuSelection == 3){//Print
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
				System.out.println("Done");
			}
			
			else if(menuSelection == 4){//Shuffle
				//TODO Shuffle array
				Collections.shuffle(Arrays.asList(array));
				System.out.println("Done");
			}
			
			else if(menuSelection == 5){//Look for place
				System.out.println("What number are you looking for?");
				test = Utility.checkError(0, 2147483647, in);
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
			
			else if(menuSelection == 6){//Check for ascending
				for(int i = 0; i < (array.length-1); i++){
					if(array[i] < array[i+1])
					{}
					else{
						System.out.println("The list is not in ascending order");
						ascending = false;
						break;
					}
				}
				if(ascending){
					System.out.println("The list is in ascending order");
				}
				ascending = true;
			}
			
			else if(menuSelection == 7){//shuffle until ascending
				for(int i = 0; i < 10000; i++){
					//TODO shuffle until in ascending
				}
				System.out.println("Done");
			}
			
			else if(menuSelection == 8){ //lowest value
				test = array[0];
				for(int i = 0; i < 100; i++){
					if(array[i] < test){
						test = array[i];
					}
				}
				System.out.println("The lowest value is: " + test);
			}
			
			else if(menuSelection ==9){//highest value
				test = array[0];
				for(int i = 0; i < 100; i++){
					if(array[i] > test){
						test = array[i];
					}
				}
				System.out.println("The highest value is: " + test);
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