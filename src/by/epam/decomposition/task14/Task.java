package by.epam.decomposition.task14;

import java.util.Scanner;

/* Натуральное число, в записи которого n цифр, называется числом Армстронга, если
   сумма его цифр, возведенная в степень n, равна самому числу. Найти все числа
   Армстронга от 1 до k. Для решения задачи использовать декомпозицию. */

public class Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input number (k) = ");
		int k = scanner.nextInt();
		
		while (k < 2) {
			System.out.println("Invalid value of number, try again");
			k = scanner.nextInt();
		}
		scanner.close();
		
		getArmstrongNumbers(k);
	}

	private static int getSum(int number) {
		int sum = 0;
		while (number != 0) {
			sum += number % 10;
			number /= 10;
		}
		return sum;
	}

	private static int getSize(int number) {
		int count = 0;
		while (number != 0) {
			count++;
			number /= 10;
		}
		return count;
	}

	private static boolean isArmstrongNumber(int number) {
		if (Math.pow(getSum(number), getSize(number)) == number) {
			return true;
		} else {
			return false;
		}
	}

	private static void getArmstrongNumbers(int number) {
		for (int i = 1; i < number; i++) {
			if (isArmstrongNumber(i)) {
				System.out.println(i);
			}
		}
	}

}
