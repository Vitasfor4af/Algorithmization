package by.epam.decomposition.task8;

/* Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4]
   +D[5] +D[6]. Пояснение. Составить метод(методы) для вычисления суммы трех последовательно
   расположенных элементов массива с номерами от k до m. */

public class Task {

	public static void main(String[] args) {
		float[] array = new float[6];

		for (int i = 0; i < array.length; i++) {
			array[i] = (float) ((Math.random() * ((50 - 0) + 1)) + 0);
		}

		System.out.println("Source array = ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println("\nD[1] + D[2] + D[3] = " + getSum(1, 3, array) + "\nD[3] + D[4] + D[5] = "
				+ getSum(3, 5, array) + "\nD[4] + D[5] + D[6] = " + getSum(4, 6, array));
	}

	private static float getSum(int k, int m, float[] array) {
		float sum = 0;
		for (int i = k - 1; i < m; i++) {
			sum += array[i];
		}
		return sum;
	}

}
