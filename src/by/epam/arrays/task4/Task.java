package by.epam.arrays.task4;

import java.util.Scanner;

/* Даны действительные числа а 1 ,а 2 ,..., а n .
 Поменять местами наибольший и наименьший элементы. */

public class Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the size of array = ");
		int size = scanner.nextInt();
		double[] array = new double[size];
		System.out.println("Input the elements of array: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextDouble();
		}
		scanner.close();
		double min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min)
				min = array[i];
		}

		double max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];
		}
		System.out.print("MAX = " + max + " ");
		System.out.println("MIN = " + min);
		System.out.println("Before");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			if (array[i] == max) {
				array[i] = min;
			} else if (array[i] == min) {
				array[i] = max;
			}
		}
		System.out.println("After");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
	}
}
