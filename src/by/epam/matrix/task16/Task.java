package by.epam.matrix.task16;

import java.util.Scanner;

/* Магическим квадратом порядка n называется квадратная матрица размера n x n,
   составленная из чисел 1, 2, 3,..., n 2 так, что суммы
   по каждому столбцу, каждой строке и каждой из двух больших
    диагоналей равны между собой. Построить такой квадрат.
     Пример магического квадрата порядка 3:
					6 1 8
					7 5 3
					2 9 4 */

public class Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the size of matrix = ");
		int n = scanner.nextInt();
		while (n < 3) {
			System.out.println(
					"Incorrect data, the minimum dimension of the matrix for the magic square begins with 3. try again");
			n = scanner.nextInt();
		}
		int[][] magicSquare = new int[n][n];
		if (n % 2 != 0) {
			int i = n / 2;
			int j = n - 1;

			// One by one put all values in magic square
			for (int num = 1; num <= n * n;) {
				if (i == -1 && j == n) {
					j = n - 2;
					i = 0;
				} else {
					// 1st condition helper if next number
					// goes to out of square's right side
					if (j == n) {
						j = 0;
					}

					// 1st condition helper if next number is
					// goes to out of square's upper side
					if (i < 0) {
						i = n - 1;
					}
				}

				if (magicSquare[i][j] != 0) {
					j -= 2;
					i++;
					continue;
				} else
					magicSquare[i][j] = num++;
				j++;
				i--;
			}
		} else {
			int i, j;

			// filling matrix with its count value
			// starting from 1;
			for (i = 0; i < n; i++) {
				for (j = 0; j < n; j++) {
					magicSquare[i][j] = (n * i) + j + 1;
				}
			}
			// Top Left corner of Matrix
			// (order (n/4)*(n/4))
			for (i = 0; i < n / 4; i++) {
				for (j = 0; j < n / 4; j++) {
					magicSquare[i][j] = (n * n + 1) - magicSquare[i][j];
				}
			}
			// Top Right corner of Matrix
			// (order (n/4)*(n/4))
			for (i = 0; i < n / 4; i++) {
				for (j = 3 * (n / 4); j < n; j++) {
					magicSquare[i][j] = (n * n + 1) - magicSquare[i][j];
				}
			}
			// Bottom Left corner of Matrix
			// (order (n/4)*(n/4))
			for (i = 3 * n / 4; i < n; i++) {
				for (j = 0; j < n / 4; j++) {
					magicSquare[i][j] = (n * n + 1) - magicSquare[i][j];
				}
			}
			// Bottom Right corner of Matrix
			// (order (n/4)*(n/4))
			for (i = 3 * n / 4; i < n; i++) {
				for (j = 3 * n / 4; j < n; j++) {
					magicSquare[i][j] = (n * n + 1) - magicSquare[i][j];
				}
			}
			// Centre of Matrix (order (n/2)*(n/2))
			for (i = n / 4; i < 3 * n / 4; i++) {
				for (j = n / 4; j < 3 * n / 4; j++) {
					magicSquare[i][j] = (n * n + 1) - magicSquare[i][j];
				}
			}
		}
		// print magic square
		System.out.println("The Magic Square for " + n + ":\n");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(magicSquare[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("\nSum of each row or column = " + n * (n * n + 1) / 2);
	}

}
