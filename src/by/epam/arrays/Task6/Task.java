package by.epam.arrays.Task6;

import java.util.Scanner;

/* Задана последовательность N вещественных чисел.
 Вычислить сумму чисел, порядковые номера которых
являются простыми числами. */

public class Task {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the size of array = ");
		int size = scanner.nextInt();
		float[] array = new float[size];
		float sum = 0;
		System.out.println("Input the elements of array: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextFloat();
		}
		scanner.close();

		for (int i = 0; i < array.length; i++) {
			boolean result = true;
			if ((i + 1) == 1) {
				result = false;
			} else {
				for (int j = 2; j < (i + 1); j++) {
					if ((i + 1) % j == 0)
						result = false;
					break;
				}
			}
			if (result)
				sum += array[i];
		}
		System.out.println("SUM = " + (int) sum);
	}
}
