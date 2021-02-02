import java.util.Scanner;

public class Banknotes {
    public static void main(String[] args) {
        Scanner takeIn = new Scanner(System.in);

        int input = takeIn.nextInt();
        System.out.println(input);
        while(input>0){
            if(input/100!=0){
                System.out.println(input/100+" nota(s) de R$ 100,00");
                input=input%100;
            }
            else
                System.out.println(input/100+" nota(s) de R$ 100,00");


            if(input/50!=0){
                System.out.println(input/50+" nota(s) de R$ 50,00");
                input=input%50;
            }
            else
                System.out.println(input/50+" nota(s) de R$ 50,00");

            
            if(input/20!=0){
                System.out.println(input/20+" nota(s) de R$ 20,00");
                input=input%20;
            }
            else
                System.out.println(input/20+" nota(s) de R$ 20,00");

            if(input/10!=0){
                System.out.println(input/10+" nota(s) de R$ 10,00");
                input=input%10;
            }
            else
                System.out.println(input/10+" nota(s) de R$ 10,00");

            if(input/5!=0){
                System.out.println(input/5+" nota(s) de R$ 5,00");
                input=input%5;
            }
            else
                System.out.println(input/5+" nota(s) de R$ 5,00");

            if(input/2!=0){
                System.out.println(input/2+" nota(s) de R$ 2,00");
                input=input%2;
            }
            else
                System.out.println(input/2+" nota(s) de R$ 2,00");

            if(input/1!=0){
                System.out.println(input/1+" nota(s) de R$ 1,00");
                input=input%1;
            }
            else
                System.out.println(input/1+" nota(s) de R$ 1,00");


        }



        
    }
    
}
