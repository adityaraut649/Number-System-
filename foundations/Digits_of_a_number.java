import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // number of test cases
        int sum = 0;
         while(n > 0){
            sum++;
            n = n / 10;
         }
      System.out.print(sum);
    }
}

