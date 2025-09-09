import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();  // number of test cases

        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();

            if (b <= 1) {
                System.out.println("Not prime");
                continue;
            }

            int count = 0;
            for (int j = 2; j * j <= b; j++) {
                if (b % j == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println("prime");
            } else {
                System.out.println("Not prime");
            }
        }
    }
}

//Case 1 → n = 5
//
//count = 0
//
//Loop: div = 2; 2*2 = 4 <= 5 ✅
//
//        5 % 2 != 0 → no divisor found
//
//Next: div = 3; 3*3 = 9 > 5 ❌ → loop ends
//
//count == 0 → print prime