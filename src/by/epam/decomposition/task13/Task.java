package by.epam.decomposition.task13;

import java.util.Scanner;

/* Два простых числа называются «близнецами», если они отличаются друг от
   друга на 2 (например, 41 и 43). Найти и напечатать все пары «близнецов»
   из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
   решения задачи использовать декомпозицию. */

public class Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input number greater than 2 = ");
		int n = scanner.nextInt();
		
		while (n <= 2) {
			System.out.println("Invalid value of number, try again");
			n = scanner.nextInt();
		}
		scanner.close();
		
		getPairsNumbers(n);
	}

	private static void getPairsNumbers(int n) {
		for (int i = n; i < 2 * n - 1; i++) {
			if (isTwin(i) == isTwin(i + 2)) {
				System.out.println(i + " and " + (i + 2));
			}
		}
	}

	private static boolean isTwin(int number) {
		for (int i = 1; i * i <= number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
