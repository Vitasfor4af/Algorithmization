package by.epam.decomposition.task6;

import java.util.Scanner;

/* Написать метод(методы), проверяющий, являются ли данные три
   числа взаимно простыми. */

public class Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input natural number a = ");
		int a = scanner.nextInt();
		System.out.print("Input natural number b = ");
		int b = scanner.nextInt();
		System.out.print("Input natural number c = ");
		int c = scanner.nextInt();

		while (!isNaturalNumbers(a, b, c)) {
			System.out.println("one of the numbers entered is not natural, try again.");
			System.out.print("Input natural number a = ");
			a = scanner.nextInt();
			System.out.print("Input natural number b = ");
			b = scanner.nextInt();
			System.out.print("Input natural number c = ");
			c = scanner.nextInt();
		}
		scanner.close();

		if (isCoprime(a, b, c)) {
			System.out.println("given numbers are coprime");
		} else {
			System.out.println("given numbers are not coprime.");
		}
	}

	private static int greatestCommonDivisor(int a, int b) {
		if (a == 0) {
			return b;
		}
		return greatestCommonDivisor(b % a, a);
	}

	private static boolean isCoprime(int a, int b, int c) {
		return greatestCommonDivisor(greatestCommonDivisor(a, b), c) == 1;
	}

	private static boolean isNaturalNumbers(int a, int b, int c) {
		if (a > 0 && b > 0 && c > 0) {
			return true;
		} else {
			return false;
		}
	}

}
