package by.epam.arrays.Task3;

import java.util.Scanner;
import java.util.Random;

/* Дан массив действительных чисел, размерность которого N.
 Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов. */

public class Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random ram = new Random();
		System.out.print("Input the size of array = ");
		int size = scanner.nextInt();
		scanner.close();
		int countForNegative = 0;
		int countForPositive = 0;
		int countForZero = 0;
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = ram.nextInt((100 - (-50)) + 1) + (-50);
			if (array[i] < 0)
				countForNegative++;
			if (array[i] > 0)
				countForPositive++;
			if (array[i] == 0)
				countForZero++;
		}
		System.out.println("Count of negative numbers = " + countForNegative);
		System.out.println("Count of positive numbers = " + countForPositive);
		System.out.println("Count of zero numbers = " + countForZero);
	}
}
