package by.epam.arrays.Task5;

import java.util.Scanner;
import java.util.Random;

/* Даны целые числа а 1 ,а 2 ,..., а n .
 Вывести на печать только те числа, для которых а i > i. */

public class Task {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the size of array = ");
		int size = scanner.nextInt();
		System.out.print("Input the value of i = ");
		int i = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Input the elements of array: ");
		for (int j = 0; j < array.length; j++) {
			array[j] = scanner.nextInt();
		}
		scanner.close();
		for (int j = 0; j < array.length; j++) {
			if (array[j] > i)
				System.out.print(array[j] + "\t");
		}
	}
}
