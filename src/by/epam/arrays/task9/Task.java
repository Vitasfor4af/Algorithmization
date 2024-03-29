package by.epam.arrays.task9;

import java.util.Scanner;
import static java.lang.Math.min;

/* В массиве целых чисел с количеством элементов n найти наиболее
 часто встречающееся число. Если таких
чисел несколько, то определить наименьшее из них. */

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

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println();

		int greatestFrequency = 0;
		int greatestFrequencyNumber = 0;
		for (int i = 0; i < array.length; i++) {
			int frequencyNumber = array[i];
			int frequency = 0;
			for (int j = 0; j < array.length; j++) {
				if (array[j] == frequencyNumber)
					frequency++;
			}
			if (frequency > greatestFrequency) {
				greatestFrequency = frequency;
				greatestFrequencyNumber = frequencyNumber;
			} else if (frequency == greatestFrequency) {
				greatestFrequencyNumber = min(frequencyNumber, greatestFrequencyNumber);
			}
		}

		System.out.println("Result =  " + greatestFrequencyNumber);

	}

}
