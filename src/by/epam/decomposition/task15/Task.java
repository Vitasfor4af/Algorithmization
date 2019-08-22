package by.epam.decomposition.task15;

import java.util.Scanner;

/* Найти все натуральные n-значные числа, цифры в которых образуют
   строго возрастающую последовательность (например, 1234, 5789). Для решения
   задачи использовать декомпозицию. */

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

		getIncSequence(n);
	}

	private static void getIncSequence(int number) {
		for (int i = 1; i <= 10 - number; i++) {
			for (int j = i; j <= i + number - 1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
