package by.epam.sort.task2;

import java.util.Scanner;

/* Даны две последовательности a 1 <= a 2 <= ... <= a n и b 1 <= b 2 <= ... <= b m.
   Образовать из них новую последовательность чисел так, чтобы она тоже
   была неубывающей. Примечание. Дополнительный массив не использовать. */

public class Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the size of first array = ");
		int sizeFirst = scanner.nextInt();
		System.out.print("Input the size of second array = ");
		int sizeSecond = scanner.nextInt();
		
		while (sizeFirst <= 1 || sizeSecond < 1) {
			System.out.println("Invalid value of sizes, try again ");
			System.out.print("Input the size of first array = ");
			sizeFirst = scanner.nextInt();
			System.out.print("Input the size of second array = ");
			sizeSecond = scanner.nextInt();
		}
		scanner.close();
		
		int[] firstArray = new int[sizeFirst * (sizeSecond * 2)];
		System.out.println("Source first array = ");
		for (int i = 0; i < sizeFirst; i++) {
			firstArray[i] = i;
			System.out.print(firstArray[i] + " ");
		}

		final int TEST_NUMBER = 3;
		int[] secondArray = new int[sizeSecond];
		System.out.println("\nSource second array = ");
		for (int i = 0; i < sizeSecond; i++) {
			secondArray[i] = TEST_NUMBER * i;
			System.out.print(secondArray[i] + " ");
		}

		for (int i = 0; i < sizeSecond; i++) {
			if (secondArray[i] >= firstArray[sizeFirst]) {
				sizeFirst++;
				firstArray[sizeFirst - 1] = secondArray[i];
			}
		}

		for (int i = sizeFirst - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (firstArray[j] > firstArray[j + 1]) {
					int tmp = firstArray[j];
					firstArray[j] = firstArray[j + 1];
					firstArray[j + 1] = tmp;
				}
			}
		}

		System.out.println("\nunion of arrays =");
		for (int i = 0; i < sizeFirst; i++) {
			System.out.print(firstArray[i] + " ");
		}
	}

}
