package by.epam.decomposition.task16;

import java.util.Scanner;

/* Написать программу, определяющую сумму n - значных чисел, содержащих
   только нечетные цифры. Определить также, сколько четных цифр в найденной сумме.
   Для решения задачи использовать декомпозицию. */

public class Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the number of digits from 2 to 9 n = ");
		int n = scanner.nextInt();

		while (n < 2 || n > 9) {
			System.out.println("Invalid value of number, try again");
			n = scanner.nextInt();
		}
		scanner.close();

		int lowBound = (int) Math.pow(10.0, n - 1) + 1;
		int highBound = (lowBound - 1) * 10 - 1;

		System.out.println("sum = " + getSum(n, lowBound, highBound));
		System.out.println("even number count = " + evenNumberCount(n, lowBound, highBound));
	}

	private static boolean isOdd(int number, int n) {
		int count = 0;
		while (number != 0) {
			if (number % 2 != 0) {
				count++;
			}
			number /= 10;
		}
		if (count == n) {
			return true;
		} else {
			return false;
		}
	}

	private static long getSum(int n, int lowBound, int highBound) {
		long sum = 0;
		for (int i = lowBound; i < highBound; i++) {
			if (isOdd(i, n)) {
				sum += i;
			}
		}
		return sum;
	}

	private static int evenNumberCount(int n, int lowBound, int highBound) {
		int count = 0;
		long sum = getSum(n, lowBound, highBound);
		while (sum != 0) {
			if (sum % 2 == 0) {
				count++;
			}
			sum /= 10;
		}
		return count;
	}
}
