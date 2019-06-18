import java.util.Scanner;

/* В числовой матрице поменять местами два столбца любых столбца,
 т. е. все элементы одного столбца поставитьна соответствующие
  им позиции другого, а его элементы второго переместить в
   первый. Номера столбцов вводит пользователь с клавиатуры. */

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

        //out before change
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.print("Input the number or first column:");
        int firstCol = scn.nextInt() - 1;

        System.out.print("Input the number or second column:");
        int secondCol = scn.nextInt() - 1;

        for (int i = 0; i < array.length; i++) {
            int tmp = array[i][firstCol];
            array[i][firstCol] = array[i][secondCol];
            array[i][secondCol] = tmp;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
