package sheet2;

import java.util.Scanner;

public class Sh2Pr10 {
    public Sh2Pr10() {
        System.out.println("problem 10 from sheet2");
    }

    public void run() {
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String multiplicationTable = "";
        for(int i =1; i<=12; i++){
            multiplicationTable += number + " * " + i  + " = " + (i*number) + "\n";
        }
        System.out.printf("Multiplication Table Of ( %d )  is: \n %s", number, multiplicationTable);
    }
}
