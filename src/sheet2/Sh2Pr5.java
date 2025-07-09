package sheet2;

import java.util.Scanner;

public class Sh2Pr5 {
    public Sh2Pr5() {
        System.out.println("problem 5 from sheet2");
    }

    public void run() {
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String oddOrEven;
        if(number%2 ==0){
            oddOrEven = "Even";
        }else{
            oddOrEven = "Odd";
        }
        System.out.printf("%d is %s\n", number, oddOrEven);

    }
}
