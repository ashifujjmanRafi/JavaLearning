//package After80;

import java.util.Scanner;

public class MaximumInArray {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int[] arr1 = new int[x];

        takeInput(arr1);

        System.out.println("enter the value you want to search :");
        int svalue = s.nextInt();

        System.out.println(searchOccurance(arr1, svalue));

    }

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
