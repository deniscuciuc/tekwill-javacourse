package lesson8homework;
import java.util.Scanner;

public class DisplayArray {
    public static void main(String[] args) {
    		boolean differentNumbers = true;

    		Scanner inputArrayLength = new Scanner(System.in);
    		System.out.println("Type here the length of the array: ");
    		int arrayLength = inputArrayLength.nextInt();
    		
    		Scanner inputArrayValues = new Scanner(System.in);
    		int arrayValues[] = new int[arrayLength];

			System.out.println("Type here int values of your array: ");
				for (int i = 0; i < arrayValues.length; i++) {
					arrayValues[i] = inputArrayValues.nextInt();
				}

    		System.out.println("There are array values: ");
    		for (int i = 0; i < arrayValues.length; i ++) {
    			System.out.print(arrayValues[i] + " ");
    		}
    		
	}

	static boolean checkIfExistsOneDimensionalIntArray (int[] array, int elementToCheck) {
		boolean exists = false;

		for (int i : array) {
			if (i == elementToCheck) {
				exists = true;
				break;
			}
		}
		return exists;
	}
}
