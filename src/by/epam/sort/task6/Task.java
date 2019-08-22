package by.epam.sort.task6;

import java.util.Scanner;

/* Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
   Делается это следующим образом: сравниваются два соседних элемента ai и ai+1. Если ai <= ai+1,
   то продвигаются на один элемент вперед. Если ai > ai+1, то производится перестановка и
   сдвигаются на один элемент назад. Составить алгоритм этой сортировки. */

public class Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the size of array = ");
		int size = scanner.nextInt();
		System.out.print("Input the min bound = ");
		int min = scanner.nextInt();
		System.out.print("Input the max bound = ");
		int max = scanner.nextInt();
		
		while(min >= max) {
			System.out.println("Invalid value of min bound (min < max), try again");
			System.out.print("Input the min bound = ");
			min = scanner.nextInt();
			System.out.print("Input the max bound = ");
			max = scanner.nextInt();
		}	
		scanner.close();
		
		float[] array = new float[size];

		for (int i = 0; i < array.length; i++) {
			array[i] =  (float) ((Math.random()*((max-min)+1))+min);
		}

		System.out.println("Source array = ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		int increment = array.length / 2;
		while (increment >= 1) {
			for (int startIndex = 0; startIndex < increment; startIndex++) {
				for (int i = startIndex; i < array.length - 1; i = i + increment) {
					for (int j = Math.min(i + increment, array.length - 1); j - increment >= 0; j = j - increment) {
						if (array[j - increment] > array[j]) {
							float tmp = array[j];
							array[j] = array[j - increment];
							array[j - increment] = tmp;
						} else {
							break;
						}
					}
				}
			}
			increment = increment / 2;
		}

		System.out.println("\nresult = ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
