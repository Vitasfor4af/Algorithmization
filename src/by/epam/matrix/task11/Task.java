package by.epam.matrix.task11;

import java.util.Random;

/* Матрицу 10x20 заполнить случайными числами от 0 до 15.
   Вывести на экран саму матрицу и номера строк, в
которых число 5 встречается три и более раз. */

public class Task {

	public static void main(String[] args) {
		Random random = new Random();
		int rows = 10;
		int columns = 20;
		int[][] array = new int[rows][columns];
		int[] line = new int[rows];
		System.out.println("input the elements of matrix: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = random.nextInt(15);
			}
		}
		int k = 0;
		for (int i = 0; i < array.length; i++) {
			int count = 0;
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + "\t");
				if (array[i][j] == 5) {
					count++;
				}
			}
			if (count >= 3) {
				line[k] = (i + 1);
				k++;
			}
			System.out.println("Line " + (i + 1));
		}
		System.out.println("Line numbers in which the number 5 occurs three or more times: ");
		for (int i = 0; i < k; i++) {
			System.out.println("Line " + line[i]);
		}
	}
}