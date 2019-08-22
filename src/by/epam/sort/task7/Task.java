package by.epam.sort.task7;

import java.util.Scanner;

/* Пусть даны две неубывающие последовательности действительных чисел a 1 <= a 2 <= ... <= a n
   и b 1 <= b 2 <= ... <= b m . Требуется указать те места, на которые нужно вставлять
   элементы последовательности b 1 <= b 2 <= ... <= b m в первую последовательность так,
   чтобы новая последовательность оставалась возрастающей. */

public class Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the size of first array = ");
		int sizeFirst = scanner.nextInt();
		System.out.print("Input the size of second array = ");
		int sizeSecond = scanner.nextInt();

		int[] firstArray = new int[sizeFirst];
		int[] secondArray = new int[sizeSecond];

		int[] compositeArray = new int[sizeFirst + sizeSecond];

		for (int i = 0; i < firstArray.length; i++) {
			System.out.print("firstArray[" + i + "]=");
			firstArray[i] = scanner.nextInt();
		}

		for (int i = 0; i < secondArray.length; i++) {
			System.out.print("secondArray[" + i + "]=");
			secondArray[i] = scanner.nextInt();
		}
		scanner.close();

		for (int i = 0; i < firstArray.length; i++) {
			compositeArray[i] = firstArray[i];
		}

		int len = sizeFirst + 1;
		for (int i = 0; i < secondArray.length; i++) {
			int index = 0;
			while (secondArray[i] >= compositeArray[index] && index < len - 1) {
				index++;
			}

			for (int j = len - 1; j > index; j--) {
				compositeArray[j] = compositeArray[j - 1];
			}

			compositeArray[index] = secondArray[i];
			
			len++;
		}

		System.out.println("\nunion of arrays =");
		for (int i = 0; i < compositeArray.length; i++) {
			System.out.print("first array[" + i + "] = " + compositeArray[i] + "\n");
		}

//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Input the size of first array = ");
//		int sizeFirst = scanner.nextInt();
//		System.out.print("Input the size of second array = ");
//		int sizeSecond = scanner.nextInt();
//		while (sizeFirst <= 1 || sizeSecond < 1) {
//			System.out.println("Invalid value of sizes, try again ");
//			System.out.print("Input the size of first array = ");
//			sizeFirst = scanner.nextInt();
//			System.out.print("Input the size of second array = ");
//			sizeSecond = scanner.nextInt();
//		}
//		scanner.close();
//		int[] firstArray = new int[sizeFirst * (sizeSecond * 2)];
//		System.out.println("Source first array = ");
//		for (int i = 0; i < sizeFirst; i++) {
//			firstArray[i] = i;
//			System.out.print(firstArray[i] + " ");
//		}
//
//		final int TEST_NUMBER = 3;
//		int[] secondArray = new int[sizeSecond];
//		System.out.println("\nSource second array = ");
//		for (int i = 0; i < sizeSecond; i++) {
//			secondArray[i] = TEST_NUMBER * i;
//			System.out.print(secondArray[i] + " ");
//		}
//		
//		System.out.println("Input number b = ");
//		int b = scanner.nextInt();
//		
//		int i = 1;
//		while ((b >= firstArray[i]) && (i < sizeFirst)) {
//			i++;
//		}
//		for (int j = sizeFirst; j < i; j--) {
//			firstArray[j] = firstArray[j - 1];
//			firstArray[i] = b;
//		}
//
//		System.out.println("\nunion of arrays =");
//		for (i = 1; i < sizeSecond; i++) {
//			System.out.print("first array[" + i + "] = " + firstArray[i] + "\n");
//		}
	}

}
