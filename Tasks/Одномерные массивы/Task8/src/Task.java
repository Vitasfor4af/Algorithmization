
/* Дана последовательность целых чисел a 1 , a 2 , ... , a n .
 Образовать новую последовательность, выбросив из
исходной те члены, которые равны min( a 1 , a 2 , ... , a n ) . */

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Input the size of array = ");
        int size = scn.nextInt();
        int[] array = new int[size];
        int[] newArray = new int[size];
        int min = searchMin(array);
        System.out.println("Input the elements of array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scn.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != min) {
                newArray[i] = array[i];
            }
        }
        for (int i = 0; i < newArray.length; i++) {
            if(newArray[i] != min)
            System.out.print(newArray[i] + "\t");
        }
    }

    public static int searchMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) min = array[i];
        }
        return min;
    }
}
