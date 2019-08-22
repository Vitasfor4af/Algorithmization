package by.epam.decomposition.task1;

import java.util.Scanner;

/* Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего
   общего кратного двух натуральных чисел */

public class Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input natural number a = ");
		int a = scanner.nextInt();
		System.out.print("Input natural number b = ");
		int b = scanner.nextInt();

		while (!isNaturalNumbers(a, b)) {
			System.out.println("one of the numbers entered is not natural, try again.");
			System.out.print("Input natural number a = ");
			a = scanner.nextInt();
			System.out.print("Input natural number b = ");
			b = scanner.nextInt();
		}
		scanner.close();

		System.out.println("greatest common divisor = " + greatestCommonDivisor(a, b));
		System.out.println("least common multiple = " + leastCommonMultiple(a, b));
	}

	private static int greatestCommonDivisor(int a, int b) {
		if (a == 0) {
			return b;
		}
		return greatestCommonDivisor(b % a, a);
	}

	private static int leastCommonMultiple(int a, int b) {
		return (a * b) / greatestCommonDivisor(a, b);
	}

	private static boolean isNaturalNumbers(int a, int b) {
		if (a > 0 && b > 0) {
			return true;
		} else {
			return false;
		}
	}

}
