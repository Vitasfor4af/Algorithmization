package by.epam.decomposition.task2;

import java.util.Scanner;

/* Написать метод(методы) для нахождения наибольшего общего делителя четырех
   натуральных чисел. */

public class Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input natural number a = ");
		int a = scanner.nextInt();
		System.out.print("Input natural number b = ");
		int b = scanner.nextInt();
		System.out.print("Input natural number c = ");
		int c = scanner.nextInt();
		System.out.print("Input natural number d = ");
		int d = scanner.nextInt();
		
		while (!isNaturalNumbers(a, b, c, d)) {
			System.out.println("one of the numbers entered is not natural, try again.");
			System.out.print("Input natural number a = ");
			a = scanner.nextInt();
			System.out.print("Input natural number b = ");
			b = scanner.nextInt();
			System.out.print("Input natural number c = ");
			c = scanner.nextInt();
			System.out.print("Input natural number d = ");
			d = scanner.nextInt();
		}
		scanner.close();

		int[] nums = { a, b, c, d };
		int gcd = nums[0];
		for (int i = 1; i < nums.length; i++) {
			gcd = greatestCommonDivisor(nums[i], gcd);
		}

		System.out.println("greatest common divisor = " + gcd);

	}

	private static int greatestCommonDivisor(int a, int b) {
		if (a == 0) {
			return b;
		}
		return greatestCommonDivisor(b % a, a);
	}

	private static boolean isNaturalNumbers(int a, int b, int c, int d) {
		if (a > 0 && b > 0 && c > 0 && d > 0) {
			return true;
		} else {
			return false;
		}
	}

}
