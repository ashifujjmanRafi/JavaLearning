
import java.util.Scanner;

public class MaximumInArray {

    public static void main(String[] args) {

        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the length of array :");
            int x = s.nextInt();
            int[] arr1 = new int[x];
            System.out.println("enter the value :");
            takeInput(arr1);

            System.out.println("enter the value you want to search :");
            int svalue = s.nextInt();
            System.out.println("the occurence of the value " + svalue + " is :" + searchOccurance(arr1, svalue));

            maximumNum(arr1);
        }

    }

    // searching the maximum and minimum
    private static void maximumNum(int[] arr1) {
        int max = 0;
        int min = 99999999;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > max)
                max = arr1[i];

            if (arr1[i] < min)
                min = arr1[i];
        }

        System.out.println("maximum value of array is " + max);

        System.out.println("minimum value of array is " + min);

    }

    // searching the occurence of value
    private static int searchOccurance(int[] arr1, int svalue) {
        int occ = 0;
        for (int i = 0; i < arr1.length; i++)
            if (arr1[i] == svalue)
                occ++;
        return occ;

    }

    private static void takeInput(int[] arr1) {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < arr1.length; i++)
            arr1[i] = s.nextInt();
    
    }
 
}
