package by.epam.decomposition.task9;

import java.util.Scanner;

/* Даны числа X, Y, Z, Т — длины сторон четырехугольника.
   Написать метод(методы) вычисления его площади, если угол между сторонами
   длиной X и Y— прямой. */

public class Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the side of the tetragon X = ");
		double x = scanner.nextDouble();
		System.out.print("Input the side of the tetragon Y = ");
		double y = scanner.nextDouble();
		System.out.print("Input the side of the tetragon Z = ");
		double z = scanner.nextDouble();
		System.out.print("Input the side of the tetragon T = ");
		double t = scanner.nextDouble();

		while (x <= 0 || y <= 0 || z <= 0 || t <= 0) {
			System.out.println("Invalid value of sides, try again");
			System.out.print("Input the side of the tetragon X = ");
			x = scanner.nextDouble();
			System.out.print("Input the side of the tetragon Y = ");
			y = scanner.nextDouble();
			System.out.print("Input the side of the tetragon Z = ");
			z = scanner.nextDouble();
			System.out.print("Input the side of the tetragon T = ");
			t = scanner.nextDouble();
		}
		scanner.close();

		System.out.println("square of tetragon = " + getSquare(x, y, z, t));
	}

	private static double getSquare(double x, double y, double z, double t) {
		double diagonal = Math.hypot(x, y);
		double firstPartSquare = x * y * 0.5;
		double secondPartSquare = 0.25
				* Math.sqrt((diagonal + z + t) * (diagonal + z - t) * (diagonal + t - z) * (z + t - diagonal));
		return firstPartSquare + secondPartSquare;
	}

}
