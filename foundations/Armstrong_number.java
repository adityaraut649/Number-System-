import java.util.Scanner;

class Armstrong_number {
 // An Armstrong number is a number that is equal to the sum of cubes of its digits

    // input 153 example (1*1*1) (5*5*5) (3*3*3)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int res , temp , sum = 0;
         temp = a ;
        while(a > 0) {
            res = a  % 10;   // collecting reamainder
            a = a / 10;      // narrow the number
            sum += (res * res * res); // sum of cubes
        }
        if(temp == sum) {
            System.out.println(temp + " is an Armstrong number");
        } else {
            System.out.println(temp + "is an Armstronmg number");
        }
    }
}
