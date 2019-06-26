package by.epam.arrays.Task2;

import java.util.Scanner;

/* Дана последовательность действительных чисел
 а 1 ,а 2 ,..., а п . Заменить все ее члены, большие данного Z,
  этим числом. Подсчитать количество замен. */

public class Task {

    public static int count = 0;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Input the size of array = ");
        int size = scn.nextInt();
        System.out.print("Input the value of Z = ");
        int Z = scn.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.print(compute(array[i], Z) + "\t");
        }
        System.out.println("\n Number of replacements = " + count);

    }

    public static int compute(int i, int Z) {
        if (i > Z) {
            i = Z;
            count++;
        }
        return i;
    }
}
