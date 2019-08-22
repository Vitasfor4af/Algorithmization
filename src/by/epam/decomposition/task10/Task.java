package by.epam.decomposition.task10;

import java.util.Scanner;

/* Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
являются цифры числа N. */

public class Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input number N = ");
		int n = scanner.nextInt();
		
		while (!isNaturalNumber(n)) {
			System.out.println("the entered number is not natural. try again");
			n = scanner.nextInt();
		}		
		scanner.close();

		int size = getSize(n);
		int[] array = new int[size];

		fillDigitArray(array, n);

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	private static int getSize(int number) {
		int count = 0;
		while (number != 0) {
			count++;
			number /= 10;
		}
		return count;
	}

	private static void fillDigitArray(int[] array, int number) {
		int i = array.length - 1;
		while (number != 0) {
			array[i] = number % 10;
			i--;
			number /= 10;
		}
	}

	private static boolean isNaturalNumber(int number) {
		if (number > 0) {
			return true;
		} else {
			return false;
		}
	}
}
