import java.util.Scanner;

class Decimal_To_any_base {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int r = decimaltoanybase( a,b);
           System.out.println(r);
    }
    public static int decimaltoanybase(int n , int b) {
        int diz = 0;
        int p = 1;
        while(n > 0){

            int dig = n % b;
            n = n / b;

            diz += dig * p;
            p = p * 10;


        }
        return diz;
    }
}
