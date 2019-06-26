package by.epam.arrays.Task4;

import java.util.Random;
import java.util.Scanner;

/* Даны действительные числа а 1 ,а 2 ,..., а n .
 Поменять местами наибольший и наименьший элементы. */

public class Task {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Input the size of array = ");
        int size = scn.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++)
            array[i] = scn.nextInt();
        int min = searchMin(array);
        int max = searchMax(array);
        System.out.print("MAX = " + searchMax(array) + " ");
        System.out.println("MIN = " + searchMin(array));
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + "\t");
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                array[i] = min;
            } else if (array[i] == min) {
                array[i] = max;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    public static int randInt(int min, int max) {
        Random ram = new Random();
        return ram.nextInt((max - min) + 1) + min;
    }

    public static int searchMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        return max;
    }

    public static int searchMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) min = array[i];
        }
        return min;
    }
}
