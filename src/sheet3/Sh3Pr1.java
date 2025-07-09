package sheet3;

import java.util.Scanner;

public class Sh3Pr1 {
    public Sh3Pr1() {
        System.out.println("problem 1 from sheet3");
    }

    public void run() {
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(isPrime(number)){
            System.out.printf("%d is prime.\n", number);
        }else{
            System.out.printf("%d is not prime.\n", number);
        }
    }
    boolean isPrime(int number){
        // 0 or 1 are not prime
        if(number <= 1){
            return false;
        }
        // 2 is only even prima number
        if (number == 2) {
            return true;
        }

        //even numbers are not prime
        if (number%2 == 0) {
            return false;
        }

        /*
            otherwise dividing the number on all odd numbers
            from 3 to the square root of the number
            if it accepts dividing then it is not prime
         */
        for (int i = 3;i*i<=number; i+=2){
            if(number%i == 0) return false;
        }

        return true;
    }
}
