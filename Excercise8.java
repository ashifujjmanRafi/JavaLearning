import java.util.Scanner;

public class Excercise8 {

    public static void spaceString() {
        try (Scanner s = new Scanner(System.in)) {

            String var1;
            var1 = s.nextLine();
            
            for (int i = 0; i < var1.length(); i++) {
                System.out.print(var1.charAt(i) + " ");
            }
            System.out.println(" ");
            reverseStrings();

        }

    }

    public static void reverseStrings() {
        try (Scanner in = new Scanner(System.in)) {
            String str;
            str = in.nextLine();

            for (int i = str.length() - 1; i >= 0; i--) {
                System.out.print(str.charAt(i));
            }

        }

    }

    public static void main(String[] args) {
        spaceString();
        //reverseStrings();
    }

}
