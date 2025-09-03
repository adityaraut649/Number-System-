import java.util.Scanner;
// Decimal to any base
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = cal(a, b);
        System.out.println(result);


    }

    static int cal(int n, int b) {
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

}
