package by.epam.decomposition.task11;

import java.util.Scanner;

/* Написать метод(методы), определяющий, в каком из данных двух
   чисел больше цифр. */

public class Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input number a = ");
		int a = scanner.nextInt();
		System.out.print("Input number b = ");
		int b = scanner.nextInt();
		scanner.close();
		
		System.out.println("the number with the largest size = " + getMaxSize(a, b));
	}

	private static int getSize(int n) {
		int count = 0;
		while (n != 0) {
			count++;
			n /= 10;
		}
		return count;
	}

	private static int getMaxSize(int numberOne, int numberTwo) {
		if (getSize(numberOne) > getSize(numberTwo)) {
			return numberOne;
		} else {
			return numberTwo;
		}
	}

}
