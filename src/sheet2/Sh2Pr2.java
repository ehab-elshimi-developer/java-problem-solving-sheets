package sheet2;

import java.util.Scanner;

public class Sh2Pr2 {
    public Sh2Pr2() {
        System.out.println("problem 2 from sheet2");
    }

    public void run() {

        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        System.out.printf("Last digit =  %d\n", number%10);


        /*
        ** Another Solution
        */

        /*
        String numAsString = String.valueOf(number);
        char lastChar = numAsString.charAt(numAsString.length()-1);
        int lastDigit = Character.getNumericValue(lastChar);

        System.out.printf("Last digit =  %d\n", lastDigit);

         */
    }
}
