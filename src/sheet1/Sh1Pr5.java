package sheet1;

import java.util.Scanner;

public class Sh1Pr5 {
    public Sh1Pr5() {
        System.out.println("problem 5 from sheet1");
    }

    public void run() {

        int n1, n2, n3;


        Scanner inp = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        n1 = inp.nextInt();

        System.out.println("Enter Number 2: ");
        n2 = inp.nextInt();

        System.out.println("Enter Number 3 ");
        n3 = inp.nextInt();

        System.out.printf("Average = %.2f\n" , (n1 + n2+ n3) /3.0);


    }
}
