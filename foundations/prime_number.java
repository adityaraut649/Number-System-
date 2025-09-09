import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int low = sc.nextInt();  // low number low = 8;
        int high = sc.nextInt(); // high number  high = 20;

        for (int n = low; n <= high; n++) {
                int count = 0;
            for (int  j = 2; j * j <= n; j++) {
                if (n % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(n); // print if no divisor found
            }
        }
    }
}


//j = 2; 2*2 = 4 <= 11 ✅ → 11 % 2 != 0
//
//j = 3; 3*3 = 9 <= 11 ✅ → 11 % 3 != 0
//
//j = 4; 4*4 = 16 > 11 ❌ → loop ends
//
//count == 0 → print 11