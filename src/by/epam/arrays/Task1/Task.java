package by.epam.arrays.Task1;

import java.util.Scanner;

/* В массив A [N] занесены натуральные числа.
 Найти сумму тех элементов, которые кратны данному К. */

public class Task {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Input the size of array N = ");
        int N = scn.nextInt();
        System.out.print("Input the value of K = ");
        int K = scn.nextInt();
        int sum = 0;
        int[] A = new int[N];
        for (int i = 0; i < A.length; i++){
            A[i] = i;
        }
        for (int i = 0; i < A.length; i++){
            if(isMultiple(A[i], K)) sum += A[i];
        }
        System.out.println("sum = " + sum);

    }
    public static boolean isMultiple(int element, int K){
        boolean result = false;
        if(element % K == 0) result = true;
        return result;
    }
}
