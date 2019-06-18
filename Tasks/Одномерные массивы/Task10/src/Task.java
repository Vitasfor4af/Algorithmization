import java.util.Scanner;

/* Дан целочисленный массив с количеством элементов п.
 Сжать массив, выбросив из него каждый второй
элемент (освободившиеся элементы заполнить нулями).
 Примечание. Дополнительный массив не использовать. */

public class Task {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Input the size of array = ");
        int n = scn.nextInt();
        int[] array = new int[n];
        System.out.println("Input the elements of array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scn.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

        for (int i = 0; i < array.length; i++) {
            if ((i + 1) % 2 == 0) array[i] = 0;
        }

        for (int i = 0; i < array.length; i++) {
            if ((i + 1) % 2 == 0) {
                int iKeeper = i;
                for (int j = i; j < array.length; j++) {
                    if ((j + 1) % 2 != 0) {
                        int tmp = array[i];
                        array[i] = array[j];
                        array[j] = tmp;
                        i = j;
                    }
                }
                i = iKeeper;
            }
        }

        System.out.println();
        System.out.println("Result: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

    }
}
