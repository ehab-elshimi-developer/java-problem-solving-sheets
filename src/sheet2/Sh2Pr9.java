package sheet2;

import java.util.Scanner;

public class Sh2Pr9 {
    public Sh2Pr9() {
        System.out.println("problem 9 from sheet2");
    }

    public void run() {
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number>=0){
            System.out.printf("Factorial = %d \n", fact(number));
        }else {
            System.out.println("enter valid positive number.");
        }
    }
    public int fact(int number){
        if (number==0 || number==1){
            return 1;
        } else{
            return number * fact(number-1);
        }
    }
}
