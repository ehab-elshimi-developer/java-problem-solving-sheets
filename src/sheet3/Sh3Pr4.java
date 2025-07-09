package sheet3;

import java.util.Scanner;

public class Sh3Pr4 {
    public Sh3Pr4() {
        System.out.println("problem 4 from sheet3");
    }

    public void run() {
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        String primes = "";

        for (int i =1; i<number; i++){
            if(isPrime(i)){
                primes += i + " ";
            }
        }
        System.out.printf("Prime Numbers To %d : \n%s\n", number, primes);

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
