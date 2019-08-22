package by.epam.decomposition.task17;

import java.util.Scanner;

/* Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его
   цифр и т.д. Сколько таких действий надо произвести, чтобы получился нуль?
   Для решения задачи использовать декомпозицию. */

public class Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input number = ");
		int number = scanner.nextInt();
		scanner.close();

		System.out.println("To get zero from a given number, subtract the amount " + timesNumber(number) + " times.");
	}

	private static int getSum(int number) {
		int sum = 0;
		while (number != 0) {
			sum += number % 10;
			number /= 10;
		}
		return sum;
	}

	private static int timesNumber(int number) {
		int count = 0;
		while (number != 0) {
			number -= getSum(number);
			count++;
		}
		return count;
	}
}
