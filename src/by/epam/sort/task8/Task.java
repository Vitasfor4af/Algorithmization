package by.epam.sort.task8;

import java.util.Random;
import java.util.Scanner;

/* Даны дроби p 1 , p 2 , ... , p n ( p i , q i - натуральные). Составить программу,
   которая приводит эти дроби к общему q 1 q 2 q n знаменателю и упорядочивает их в
   порядке возрастания. */

public class Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		System.out.print("Input the number of fractions, size = ");
		int size = scanner.nextInt();
		
		while (size <= 1) {
			System.out.println("Invalid value of size (minimum two fraction), try again");
			size = scanner.nextInt();
		}
		
		int[] numerator = new int[size];
		int[] denominator = new int[size];

		int select;
		System.out.println("Input the method for entering fractions, manually (0) or randomly (1).");
		select = scanner.nextInt();
		if (select == 0) {
			for (int i = 0; i < size; i++) {
				System.out.println("fraction " + (i + 1));
				System.out.print("nominator = ");
				numerator[i] = scanner.nextInt();
				System.out.print("denominator = ");
				denominator[i] = scanner.nextInt();
				while ((numerator[i] < 0) && (denominator[i] < 0)) {
					System.out.println("Invalid numerator or denominator, try again");
					System.out.print("nominator = ");
					numerator[i] = scanner.nextInt();
					System.out.print("denominator = ");
					denominator[i] = scanner.nextInt();
				}
			}
		} else if (select == 1) {
			System.out.print("Input min bound, min = ");
			int min = scanner.nextInt();
			System.out.print("Input max bound, max = ");
			int max = scanner.nextInt();
			while (min >= max) {
				System.out.println("Minimum value must be less than maximum, try again");
				System.out.print("Input min bound, min = ");
				min = scanner.nextInt();
				System.out.print("Input max bound, max = ");
				max = scanner.nextInt();
			}
			for (int i = 0; i < size; i++) {
				numerator[i] = random.nextInt(max - min) + min;
				denominator[i] = random.nextInt(max - min) + min;
			}
		} else {
			System.out.println("Unsupported case was pressed.");
			System.exit(1);
		}
		scanner.close();

		int x, y;
		System.out.println("\nSource fracctions = ");
		for (int i = 0; i < size; i++) {
			System.out.println(numerator[i] + "/" + denominator[i]);
		}
		x = denominator[0];
		y = denominator[1];
		while (x != y) {
			if (x > y) {
				x = x - y;
			} else {
				y = y - x;
			}
		}
		int gcd = x; // greatest common divisor
		int lcm = (denominator[0] / gcd) * denominator[1]; // least common multiple

		for (int i = 2; i < size; i++) {
			x = denominator[i];
			y = lcm;
			while (x != y) {
				if (x > y) {
					x = x - y;
				} else {
					y = y - x;
				}
			}
			gcd = x;
			lcm = (denominator[i] / gcd) * lcm;
		}
		int d = 0;
		for (int i = 0; i < size; i++) {
			d = lcm / denominator[i];
			numerator[i] = numerator[i] * d;
			denominator[i] = lcm;
		}

		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < size; j++) {
				if (numerator[i] > numerator[j]) {
					x = numerator[i];
					numerator[i] = numerator[j];
					numerator[j] = x;
				}
			}
		}

		System.out.println("\nSorted and reduced to a common denominator fractions:");

		for (int i = 0; i < size; i++) {
			System.out.print(numerator[i] + "/" + denominator[i] + " ");
		}
	}

}
