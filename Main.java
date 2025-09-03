import java.util.Scanner;

// Decimal to any base
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int b2 = sc.nextInt();
        int result = getvalue(a, b, b2);
        System.out.println(result);


    }

    public static int getvalue(int n, int b1, int b2) {

        int dec = anybasetodecimal(n,b1);
        int dn = decimaltoanybasel(dec,b2);
        return dn;
    }

    public static int decimaltoanybasel(int n, int b) {
        int rv = 0;
        int p = 1;
        while (n > 0) {

            int dig = n % b;
            n = n / b;


            rv += dig * p;
            p = p * 10;
        }

        return rv;

    }

    public static int anybasetodecimal(int n, int b) {
        int rv = 0;
        int p = 1;
        while (n > 0) {

            int dig = n % 10;
            n = n / 10;


            rv += dig * p;
            p = p * b;
        }

        return rv;

    }

}
