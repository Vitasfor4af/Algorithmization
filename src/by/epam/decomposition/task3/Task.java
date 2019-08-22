package by.epam.decomposition.task3;

import java.util.Scanner;

/* Вычислить площадь правильного шестиугольника со стороной а, используя
   метод вычисления площади треугольника. */

public class Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input side a = ");
		double a = scanner.nextDouble();

		while (a <= 0) {
			System.out.println("Invalid value of a, try again");
			a = scanner.nextDouble();
		}
		scanner.close();

		System.out.println("hexagon area = " + (6 * getTriangleArea(a)));
	}

	private static double getTriangleArea(double a) {
		return (Math.sqrt(3) * Math.pow(a, 2)) / 4;
	}
}
