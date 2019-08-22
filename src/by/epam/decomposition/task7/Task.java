package by.epam.decomposition.task7;

/* Написать метод(методы) для вычисления суммы факториалов всех нечетных
   чисел от 1 до 9. */

public class Task {

	public static void main(String[] args) {
		System.out.println("Sum of factorials in the range from 1 to 9 = " + getSum());
	}

	private static int getSum() {
		int sum = 0;
		for (int i = 1; i < 9; i++) {
			if (i % 2 != 0) {
				sum += getFactorial(i);
			}
		}
		return sum;
	}

	private static int getFactorial(int number) {
		int result = 1;
		for (int i = 1; i <= number; i++) {
			result = result * i;
		}
		return result;
	}
}
