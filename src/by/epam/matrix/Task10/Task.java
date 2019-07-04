package by.epam.matrix.Task10;

import java.util.Random;
import java.util.Scanner;

/* Найти положительные элементы главной диагонали квадратной матрицы. */

public class Task {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the size of matrix = ");
		int size = scanner.nextInt();
		int[][] array = new int[size][size];
		System.out.println("input the elements of matrix: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = scanner.nextInt();
			}
		}
		scanner.close();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("\nThe positive elements of main diagonal");
		for (int i = 0; i < array.length; i++) {
			if(array[i][i] > 0) {System.out.print(array[i][i] + "\t");}
		}
	}
}