package by.epam.matrix.task8;

import java.util.Scanner;

/* В числовой матрице поменять местами два столбца любых столбца,
 т. е. все элементы одного столбца поставить на соответствующие
  им позиции другого, а его элементы второго переместить в
   первый. Номера столбцов вводит пользователь с клавиатуры. */

public class Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of rows = ");
		int rows = scanner.nextInt();
		System.out.print("Enter the number of columns = ");
		int columns = scanner.nextInt();

		int[][] array = new int[rows][columns];
		System.out.println("Input the elements of array: ");

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = scanner.nextInt();
			}
			System.out.println();
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.print("Input the number or first column = ");
		int firstCol = scanner.nextInt() - 1;

		System.out.print("Input the number or second column = ");
		int secondCol = scanner.nextInt() - 1;
		scanner.close();

		for (int i = 0; i < array.length; i++) {
			int tmp = array[i][firstCol];
			array[i][firstCol] = array[i][secondCol];
			array[i][secondCol] = tmp;
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
