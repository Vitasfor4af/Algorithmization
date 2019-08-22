package by.epam.decomposition.task4;

import java.util.Scanner;

/* На плоскости заданы своими координатами n точек. Написать метод(методы),
   определяющие, между какими из пар точек самое большое расстояние. Указание.
   Координаты точек занести в массив. */

public class Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("how many points do you want? n = ");
		int n = scanner.nextInt();

		while (n < 2) {
			System.out.println("Invalid value of size (minimum two point), try again");
			n = scanner.nextInt();
		}

		double[] xPoints = new double[n];
		double[] yPoints = new double[n];
		System.out.println("Input value of points = ");
		for (int i = 0; i < n; i++) {
			System.out.print("x" + (i + 1) + " = ");
			xPoints[i] = scanner.nextDouble();
			System.out.print("y" + (i + 1) + " = ");
			yPoints[i] = scanner.nextDouble();
		}
		scanner.close();

		for (int i = 0; i < n; i++) {
			System.out.println("x" + (i + 1) + " = " + xPoints[i] + " y" + (i + 1) + " = " + yPoints[i]);
		}

		System.out.println(getMaxRange(xPoints, yPoints));
	}

	private static String getMaxRange(double[] xPoints, double[] yPoints) {
		double maxRange = Math.sqrt(Math.pow(xPoints[0] - xPoints[1], 2) + Math.pow(yPoints[0] - yPoints[1], 2));
		int iKeeper = 1;
		int jKeeper = 2;
		for (int i = 0; i < xPoints.length - 1; i++) {
			for (int j = i + 1; j < yPoints.length; j++) {
				if (Math.sqrt(Math.pow(xPoints[i] - xPoints[j], 2) + Math.pow(yPoints[i] - yPoints[j], 2)) > maxRange) {
					maxRange = Math.sqrt(Math.pow(xPoints[i] - xPoints[j], 2) + Math.pow(yPoints[i] - yPoints[j], 2));
					iKeeper = i + 1;
					jKeeper = j + 1;
				}
			}
		}
		return "Max range between points " + iKeeper + " and " + jKeeper + " = " + maxRange;
	}
}
