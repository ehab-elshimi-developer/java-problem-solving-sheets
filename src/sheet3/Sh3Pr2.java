package sheet3;

import java.util.Scanner;

public class Sh3Pr2 {
    public Sh3Pr2() {
        System.out.println("problem 2 from sheet3");
    }

    public void run() {
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String divisors = "";
        int countDivisors = 0;
        for (int i =1; i<=number; i++){
            if(number%i == 0){
                countDivisors += 1;
                divisors += i + " ";
            }
        }

        System.out.printf("Divisors: %s\nTotal = %d\n", divisors,countDivisors);

    }

}
