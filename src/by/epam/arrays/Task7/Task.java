package by.epam.arrays.Task7;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;

/* Даны действительные числа a 1 , a 2 , ... , a n .
 Найти  max(...) */

public class Task {
    public static Random random = new Random();
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Input the size of array = ");
        int size = scn.nextInt();
        int[] array = new int[size];
        initArray(array);

        int[] specArray = getSpecArray(array);

        for (int i = 0; i < specArray.length; i++) {
            System.out.print(specArray[i] + "\t");
        }

        int max = getMax(specArray);

        System.out.println("MAX = " + max);
    }

    private static int[] getDoubleArray(int[] array) {
        int[] doubleArray = new int[array.length * 2];
        System.arraycopy(array, 0, doubleArray, 0, array.length);

        for (int i = array.length; i < doubleArray.length; i++) {
            doubleArray[i] = random.nextInt(50);
        }
        return doubleArray;
    }

    public static int[] getSpecArray(int[] array) {
        int[] doubleArray = getDoubleArray(array);
        int[] specArray = new int[array.length];

        for (int i = 0; i < specArray.length; i++) {
            if (i == specArray.length - 1) {
                specArray[i] = doubleArray[specArray.length - 1] + doubleArray[(specArray.length - 1) + 1];
            } else if (i % 2 == 0) {
                specArray[i] = doubleArray[i] + doubleArray[2 * (specArray.length - 1)];
            } else if (i % 2 != 0) {
                specArray[i] = doubleArray[i] + doubleArray[(2 * (specArray.length - 1)) - 1];
            }
        }
        return specArray;
    }

    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void initArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);;
        }
    }

}
