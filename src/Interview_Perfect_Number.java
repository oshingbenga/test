public class Interview_Perfect_Number {

    public static void main(String[] args){
        int n = 1;

        System.out.println("perfect number between 33550300 and 33550400");
        for(int i = 33550300; i<=33550400; i++) {
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

