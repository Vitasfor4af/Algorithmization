package by.epam.arrays.Task4;

import java.util.Random;
import java.util.Scanner;

/* Даны действительные числа а 1 ,а 2 ,..., а n .
 Поменять местами наибольший и наименьший элементы. */

public class Task {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the size of array = ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Input the elements of array: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		scanner.close();
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min)
				min = array[i];
		}

		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];
		}
		System.out.print("MAX = " + max + " ");
		System.out.println("MIN = " + min);
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + "\t");
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			if (array[i] == max) {
				array[i] = min;
			} else if (array[i] == min) {
				array[i] = max;
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
	}
}
