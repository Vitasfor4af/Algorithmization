package by.epam.arrays.task2;

import java.util.Scanner;

/* Дана последовательность действительных чисел
 а 1 ,а 2 ,..., а п . Заменить все ее члены, большие данного Z,
  этим числом. Подсчитать количество замен. */

public class Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the size of array = ");
		int size = scanner.nextInt();
		
		System.out.print("Input the value of Z = ");
		double Z = scanner.nextDouble();
		scanner.close();

		int count = 0;
		double[] array = new double[size];
		for (int i = 1; i < array.length; i++) {
			array[i] = i;
		}
		System.out.println("Before");
		for (int i = 1; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println("\nAfter");
		for (int i = 1; i < array.length; i++) {
			if (array[i] > Z) {
				array[i] = Z;
				count++;
			}
			System.out.print(array[i] + "\t");
		}
		System.out.println("\n Number of replacements = " + count);

	}
}
