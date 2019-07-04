package by.epam.arrays.Task8;

import java.util.Scanner;

/* Дана последовательность целых чисел a 1 , a 2 , ... , a n .
 Образовать новую последовательность, выбросив из
исходной те члены, которые равны min( a 1 , a 2 , ... , a n ) . */

public class Task {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the size of array = ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		int[] newArray = new int[size];
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
		for (int i = 0; i < array.length; i++) {
			if (array[i] != min) {
				newArray[i] = array[i];
			}
		}
		for (int i = 0; i < newArray.length; i++) {
			if (newArray[i] != 0) {
				System.out.print(newArray[i] + "\t");
			}
		}
	}
}
