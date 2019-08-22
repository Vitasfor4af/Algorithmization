package by.epam.sort.task3;

import java.util.Random;
import java.util.Scanner;

/* Сортировка выбором. Дана последовательность чисел a 1 <= a 2 <= ... <= a n .Требуется переставить
   элементы так, чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого,
   выбирается наибольший элемент и ставится на первое место, а первый - на место наибольшего.
   Затем, начиная со второго, эта процедура повторяется. Написать алгоритм сортировки выбором. */

public class Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
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
		
		for (int i = 0; i < array.length - 1; i++) {
			int minI = i;
			for (int j = i + 1; j < array.length; j++) {
				if(array[j] < array[minI]) {
					minI = j;
				}
			}
			int tmp = array[i];
			array[i] = array[minI];
			array[minI] = tmp;
		}
		
		System.out.println("\nresult = ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
