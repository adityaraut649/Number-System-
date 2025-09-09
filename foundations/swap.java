import java.util.Scanner;

class swap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 1 . using swapping using three Variable

        /*          int temp = 0;
                    temp = a;
                    a = b;
                    b = temp;
        */

        // 2. using  two variable

        /*        a = a + b;
                  b = a - b;
                  a = a - b;
        */

        // swap using a and b using XRO

        //        a = a ^ b;
        //        b = a ^ b ;
        //        a = a ^ b;

        
        System.out.println("After swapping a : " + a + " b : " + b);

    }
}
