import java.util.Scanner;


public class Array {

    public static void main(String[] args) {

        

        try(Scanner src = new Scanner(System.in))
        {
            int x = src.nextInt();
            int[] arr = new int[x];

            for (int i = 0; i < x ; i++) {
                arr[i] = src.nextInt();
                System.out.println(arr[i]);
            }
        }

        }
       
    // Resource leak: 'src' is never closed
    // to resolve this problem use #try catch

}
