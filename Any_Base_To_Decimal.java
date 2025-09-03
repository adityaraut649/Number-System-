import java.util.Scanner;

class Any_Base_To_Decimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int r = anybasetodecimal( a,b);
           System.out.println(r);
    }
    public static int anybasetodecimal(int n , int b) {
        int diz = 0;
        int p = 1;
        while(n > 0){

            int dig = n % 10;
            n = n / 10;

            diz += dig * p;
            p = p * b;


        }
        return diz;
    }
}
