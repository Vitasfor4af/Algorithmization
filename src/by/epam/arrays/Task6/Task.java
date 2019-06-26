package by.epam.arrays.Task6;

import java.util.Scanner;

/* Задана последовательность N вещественных чисел.
 Вычислить сумму чисел, порядковые номера которых
являются простыми числами. */

public class Task {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Input the size of array = ");
        int size = scn.nextInt();
        float[] array = new float[size];
        float sum = 0;
        System.out.println("Input the elements of array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scn.nextFloat();
        }
        for (int i = 0; i < array.length; i++) {
            if (isPrimary(i + 1)) sum += array[i];
        }
        System.out.println("SUM = " + sum);
    }

    public static boolean isPrimary(int number) {
        boolean result = true;
        if (number == 1) {
            result = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) result = false;
                break;
            }
        }
        return result;
    }


}
