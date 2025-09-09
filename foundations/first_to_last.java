import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // input number

        int nod = 0;             // number of digits
        int temp = n;
        while (temp != 0) {
            temp = temp / 10;
            nod++;
        }

// divisor = 10^(nod-1)
        int div = (int)Math.pow(10, nod - 1);

        while (div != 0) {
            int q = n / div;              // first digit
            System.out.println(q);

            n = n % div;                  // remove first digit
            div = div / 10;               // shift divisor
        }

    }
}
//Count digits (nod)
//
//temp = 7531
//
//        7531 / 10 = 753 → nod = 1
//
//        753 / 10 = 75 → nod = 2
//
//        75 / 10 = 7 → nod = 3
//
//        7 / 10 = 0 → nod = 4
//
//        ✅ So, nod = 4

//q = 7531 / 1000 = 7 → print 7
//
//n = 7531 % 1000 = 531
//
//div = 1000 / 10 = 100