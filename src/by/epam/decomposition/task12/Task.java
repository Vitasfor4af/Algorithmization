package by.epam.decomposition.task12;

import java.util.Scanner;

/* Даны натуральные числа К и N. Написать метод(методы)
   формирования массива А, элементами которого
являются числа, сумма цифр которых равна К и которые не большее N. */

public class Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input natural number K = ");
		int k = scanner.nextInt();
		System.out.print("Input natural number N = ");
		int n = scanner.nextInt();

		while (!isNaturalNumbers(k, n)) {
			System.out.println("one of the numbers entered is not natural, try again.");
			System.out.print("Input natural number K = ");
			k = scanner.nextInt();
			System.out.print("Input natural number N = ");
			n = scanner.nextInt();
		}
		scanner.close();

		int[] array = new int[n];
		fill(array, k, n);
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				System.out.print(array[i] + " ");
			}
		}
	}

	private static int getSum(int n) {
		int sum = 0;
		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}

	private static void fill(int[] array, int k, int n) {
		int j = 0;
		for (int i = 0; i < n; i++) {
			if (getSum(i) == k) {
				array[j++] = i;
			}
		}
	}

	private static boolean isNaturalNumbers(int k, int n) {
		if (k > 0 && n > 0) {
			return true;
		} else {
			return false;
		}
	}

}
