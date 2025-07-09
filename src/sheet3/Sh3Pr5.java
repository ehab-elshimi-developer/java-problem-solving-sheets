package sheet3;

import java.util.Scanner;

public class Sh3Pr5 {
    public Sh3Pr5() {
        System.out.println("problem 5 from sheet3");
    }

    public void run() {
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        String numAsString = ""+number;
        String newReversedNumAsString = "";
        for(int i=numAsString.length(); i>0; i--){
            newReversedNumAsString += numAsString.charAt(i-1);
        }


        System.out.printf("Reversed : %d \n", Integer.parseInt(newReversedNumAsString));

    }
}
