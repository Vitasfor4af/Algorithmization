package by.epam.arrays.task3;

import java.util.Scanner;
import java.util.Random;
import static java.lang.Math.random;
import static java.lang.Math.round;

/* Дан массив действительных чисел, размерность которого N.
 Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов. */

public class Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		System.out.print("Input the size of array = ");
		int size = scanner.nextInt();
		scanner.close();
		int countForNegative = 0;
		int countForPositive = 0;
		int countForZero = 0;
		double[] array = new double[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = (random()*((100-(-100))+1))+(-100);
			if (round(array[i]) < 0)
				countForNegative++;
			if (round(array[i]) > 0)
				countForPositive++;
			if (round(array[i]) == 0)
				countForZero++;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%.2f \t",array[i]);
		}
		System.out.println("\nCount of negative numbers = " + countForNegative);
		System.out.println("Count of positive numbers = " + countForPositive);
		System.out.println("Count of zero numbers = " + countForZero);
	}
}
