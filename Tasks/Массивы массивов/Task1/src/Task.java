import java.util.Scanner;

/* Дана матрица.
 Вывести на экран все нечетные столбцы,
  у которых первый элемент больше последнего. */

public class Task {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Input the size of array = ");
        int n = scn.nextInt();
        int[][] array = new int[n][n];
        int[][] newArray = new int[n][n];
        System.out.println("Input the elements of array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = scn.nextInt();
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("---------------------------");


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (((j + 1) % 2 != 0) && (array[0][j] > array[array.length - 1][j])) {
                    System.out.print(array[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }

}

