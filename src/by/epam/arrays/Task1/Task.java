package by.epam.arrays.Task1;

import java.util.Scanner;

/* В массив A [N] занесены натуральные числа.
 Найти сумму тех элементов, которые кратны данному К. */

public class Task {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the size of array N = ");
		int N = scanner.nextInt();
		System.out.print("Input the value of K = ");
		int K = scanner.nextInt();
		scanner.close();
		int sum = 0;
		int[] A = new int[N];
		for (int i = 0; i < A.length; i++) {
			A[i] = i;
		}
		for (int i = 0; i < A.length; i++) {
			if (A[i] % K == 0) {
				sum += A[i];
			}
		}
		System.out.println("sum = " + sum);

	}
}
