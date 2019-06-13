import java.util.Random;
import java.util.Scanner;

/* Дан массив действительных чисел, размерность которого N.
 Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов. */

public class Task {
    ;
    public static int count2 = 0;
    public static int count3 = 0;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Input the size of array = ");
        int size = scn.nextInt();
        int countForNegative = 0;
        int countForPositive = 0;
        int countForZero = 0;
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = randInt(-50,100);
            if(isNegative(array[i])) countForNegative++;
            if(isPositive(array[i])) countForPositive++;
            if(isZero(array[i])) countForZero++;
        }
        System.out.println("Count of negative numbers = " + countForNegative);
        System.out.println("Count of positive numbers = " + countForPositive);
        System.out.println("Count of zero numbers = " + countForZero);
    }

    public static int randInt(int min, int max){
        Random ram = new Random();
        return ram.nextInt((max - min) + 1) + min;
    }

    public static boolean isNegative(int i) {
        boolean result = false;
        if (i < 0) result = true;
        return result;
    }

    public static boolean isPositive(int i) {
        boolean result = false;
        if (i > 0) result = true;
        return result;
    }

    public static boolean isZero(int i) {
        boolean result = false;
        if (i == 0) result = true;
        return result;
    }
}
