import java.util.Scanner;

public class VariableLengthLoop {

    // variable length Array

    public static int sumVariableLengt(int... numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {

            sum += numbers[i];

        }
        return sum;

    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the the array size: ");
            int x = s.nextInt();

            int[] array1 = new int[x];

            fillArray(array1);// taking input from user the array data

            showArray(array1);// showing the data from array
            System.out.println();

            System.out.println(sumVariableLengt(array1));
        }
    }

    private static void showArray(int[] array1) {
        for (int i = 0; i < array1.length; i++)
            System.out.print(array1[i] + " ");
    }

    public static void fillArray(int[] array2) {

        try (Scanner s = new Scanner(System.in)) {

            for (int i = 0; i < array2.length; i++)
                array2[i] = s.nextInt();
        }

    }
}
