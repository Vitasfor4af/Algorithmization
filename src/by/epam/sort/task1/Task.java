package by.epam.sort.task1;

import java.util.Scanner;

/* Заданы два одномерных массива с различным количеством элементов и натуральное число k.
   Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого,
   при этом не используя дополнительный массив. */

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
		
		int[] firstArray = new int[sizeFirst * (sizeSecond * 2)];
		System.out.println("Source first array = ");
		for (int i = 0; i < sizeFirst; i++) {
			firstArray[i] = i;
			System.out.print(firstArray[i] + " ");
		}

		int[] secondArray = new int[sizeSecond];
		System.out.println("\nSource second array = ");
		for (int i = 0; i < sizeSecond; i++) {
			secondArray[i] = sizeFirst + i;
			System.out.print(secondArray[i] + " ");
		}

		if (firstArray[0] == (sizeFirst - 2)) {
			System.out.print("\nInput index of array (k), only available " + firstArray[0] + ", k = ");
		}else {			
			System.out.print("\nInput index of array (k), from " + firstArray[0] + " to " + (sizeFirst - 2) + ", k = ");
		}
		int k = scanner.nextInt();
		
		while (k < 0 || k > (sizeFirst - 2)) {
			System.out.println("invalid value of k, try again");
			k = scanner.nextInt();
		}
		scanner.close();
		
		for (int i = 0; i < sizeSecond; i++) {
			sizeFirst++;
			for (int j = sizeFirst; j > (k + 1 + i); j--) {
				firstArray[j] = firstArray[j - 1];
			}
			firstArray[k + 1 + i] = secondArray[i];
		}
		System.out.println("union of arrays =");
		for (int i = 0; i < sizeFirst; i++) {
			System.out.print(firstArray[i] + " ");
		}
	}
}
