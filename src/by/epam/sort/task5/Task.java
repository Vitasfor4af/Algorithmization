package by.epam.sort.task5;

import java.util.Random;
import java.util.Scanner;

/* Сортировка вставками. Дана последовательность чисел a 1 , a 2 , ... , a n . Требуется
   переставить числа в порядке возрастания. Делается это следующим образом. Пусть a 1 , a 2 , ... ,
   a i - упорядоченная последовательность, т. е. a 1 <= a 2 <= ... <= a n . Берется следующее
   число a i + 1 и вставляется в последовательность так, чтобы новая последовательность была
   тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n не будут
   перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
   с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции. */

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

		int i, j, location, selected;

		for (i = 1; i < array.length; ++i) {
			j = i - 1;

			selected = array[i];
			location = binarySearch(selected, array, 0, j);

			while (j >= location) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = selected;
		}

		System.out.println("\nresult = ");
		for (int k = 0; k < array.length; k++) {
			System.out.print(array[k] + " ");
		}
	}

	private static int binarySearch(int key, int[] array, int lo, int hi) {
		if (hi <= lo)
			return (key > array[lo]) ? (lo + 1) : lo;

		int mid = (lo + hi) / 2;

		if (key == array[mid])
			return mid + 1;

		if (key > array[mid])
			return binarySearch(key, array, mid + 1, hi);
		return binarySearch(key, array, lo, mid - 1);
	}

}
