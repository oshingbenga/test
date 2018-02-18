import java.util.Scanner;

public class Interview_Perfect_Number {


    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("enter two numbers");
        int a =kb.nextInt();
        int b = kb.nextInt();
        int n = 1;
        //int a = 33550300;
        //int b = 33550400;

        System.out.println("perfect number between 33550300 and 33550400");
        for(int i = a; i<=b; i++) {
            int sum = 0;
            for (n = 1; n < i; n++) {
                if (i % n == 0) {
                    sum = sum + n;

                }


            }
            if (sum == i) {
               System.out.println(i);
            }
            }
        }
    }

