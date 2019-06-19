import java.util.Scanner;

/* Дана квадратная матрица. Вывести на экран элементы,
 стоящие на диагонали */


public class Task {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Input the size of array = ");
        int n = scn.nextInt();
        int[][] array = new int[n][n];
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
            System.out.print(array[i][i] + "\t");
        }

    }
}
