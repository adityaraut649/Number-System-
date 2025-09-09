import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // number of test cases
        int  a  = 0 , fibo = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        while(n >= 2) {
            fibo = a + b;
            a = b;
            b = fibo;
            System.out.println(fibo);
            n--;
        }

    }
}

