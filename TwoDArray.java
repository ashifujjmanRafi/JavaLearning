import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {

        try (Scanner s = new Scanner(System.in)) {

            System.out.println("enter the value of collumb and row : ");

            int row = s.nextInt();

            var colloumb = s.nextInt();

            int[][] array2 = new int[row][colloumb];

            takeInput(array2, row, colloumb);

                // for (int i = 0; i < row; i++) {
                //     for (int j = 0; j < colloumb; j++) {

                //         System.out.print(array2[i][j] + " ");
                        
                //     }
                //     System.out.println();
                // }

        }

    }

    private static void takeInput(int[][] array2, int row, int colloumb) {
        Scanner s = new Scanner(System.in);
        
        int sumc=0;

        for (int i = 0; i < row; i++) {

            int sumr=0;
            int max = 0;
            
            for (int j = 0; j < colloumb; j++) {

                array2[i][j] = s.nextInt();
                sumr+=array2[i][j];
                if(array2[i][j]>max)
                    max=array2[i][j];


            }

            System.out.print("sum and max of,row " +(i+1)+" sum "+sumr +" max "+ max);
            System.out.println();
        }
        System.out.println();
    }

}
