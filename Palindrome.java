import java.util.Scanner;

public class Palindrome {

    public static void checkPlindrome() {
        try (Scanner s = new Scanner(System.in)) {

            String str = s.next();

            boolean isPalindrome = true;
            for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
                if (str.charAt(i) == str.charAt(j)) {
                    continue;
                }

                isPalindrome = false;
                break;

            }
            System.out.println(isPalindrome ? "Yes Palindrome " : "not palindrome");

        }
    }

    public static void main(String[] args) {
        checkPlindrome();
    }

}
