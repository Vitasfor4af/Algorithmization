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
		scanner.close();

		int[][] magicSquare = new int[n][n];
		if (n % 2 != 0) {
			int i = n / 2;
			int j = n - 1;

			for (int num = 1; num <= n * n;) {
				if (i == -1 && j == n) {
					j = n - 2;
					i = 0;
				} else {
					if (j == n) {
						j = 0;
					}
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
			for (i = 0; i < n; i++) {
				for (j = 0; j < n; j++) {
					magicSquare[i][j] = (n * i) + j + 1;
				}
			}
			for (i = 0; i < n / 4; i++) {
				for (j = 0; j < n / 4; j++) {
					magicSquare[i][j] = (n * n + 1) - magicSquare[i][j];
				}
			}
			for (i = 0; i < n / 4; i++) {
				for (j = 3 * (n / 4); j < n; j++) {
					magicSquare[i][j] = (n * n + 1) - magicSquare[i][j];
				}
			}
			for (i = 3 * n / 4; i < n; i++) {
				for (j = 0; j < n / 4; j++) {
					magicSquare[i][j] = (n * n + 1) - magicSquare[i][j];
				}
			}
			for (i = 3 * n / 4; i < n; i++) {
				for (j = 3 * n / 4; j < n; j++) {
					magicSquare[i][j] = (n * n + 1) - magicSquare[i][j];
				}
			}
			for (i = n / 4; i < 3 * n / 4; i++) {
				for (j = n / 4; j < 3 * n / 4; j++) {
					magicSquare[i][j] = (n * n + 1) - magicSquare[i][j];
				}
			}
		}
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
