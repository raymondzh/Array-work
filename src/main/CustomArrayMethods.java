package main;

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
}
