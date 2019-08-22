package by.epam.sort.task4;

import java.util.Random;
import java.util.Scanner;

/* Сортировка обменами. Дана последовательность чисел a1 <= a2 <= ... <= an.
   Требуется переставить числа в порядке возрастания. Для этого сравниваются
   два соседних числа ai и ai+1. Если ai > ai+1, то делается перестановка.
   Так продолжается до тех пор, пока все элементы не станут расположены в
   порядке возрастания. Составить алгоритм сортировки, подсчитывая при этом 
   количество перестановок  */

public class Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int count = 0;
		System.out.print("Input the size of array = ");
		int size = scanner.nextInt();
		scanner.close();
		
		int[] array = new int[size];

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(100);
		}

		System.out.println("Source array = ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		for (int i = array.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j] > array[j + 1]) {
					count++;
					int tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
				}
			}
		}

		System.out.println("\nresult = ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println("\nnumber of permutations = " + count);

	}

}
