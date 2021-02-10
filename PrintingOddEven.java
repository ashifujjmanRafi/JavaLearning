import java.util.Scanner;

public class PrintingOddEven {

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {

            //System.out.println("enter   value untill its 100: ");
            int x = 0;

            while (x <= 100) {
                System.out.println("enter   value untill its 100: ");
                int i = s.nextInt();
                x = x + i;
            }
            System.out.println("Done");

        }
    }

}
