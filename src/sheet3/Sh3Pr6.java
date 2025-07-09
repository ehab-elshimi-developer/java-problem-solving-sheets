package sheet3;

import java.util.Scanner;

public class Sh3Pr6 {
    public Sh3Pr6() {
        System.out.println("problem 6 from sheet3");
    }

    public void run() {
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int reversedNumber = reverseNumber(number);

        if(number == reversedNumber){
            System.out.printf("%d is a palindrome.\n", number);
        }else{
            System.out.printf("%d is not palindrome.\n", number);
        }
    }
    int reverseNumber(int number){
        String numAsString = ""+number;
        String newReversedNumAsString = "";
        for(int i=numAsString.length(); i>0; i--){
            newReversedNumAsString += numAsString.charAt(i-1);
        }
        return Integer.parseInt(newReversedNumAsString);
    }
}
