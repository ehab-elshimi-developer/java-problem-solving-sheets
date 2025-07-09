package sheet2;

import java.util.Scanner;

public class Sh2Pr3 {
    public Sh2Pr3() {
        System.out.println("problem 3 from sheet2");
    }

    public void run() {
        int fDigit, sDigit;
        System.out.println("Enter a 2-digit number:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        fDigit = number/10;
        sDigit=number%10;

        System.out.printf("Sum of digits = %d + %d = %d\n", fDigit, sDigit, (fDigit+sDigit));


    }
}
