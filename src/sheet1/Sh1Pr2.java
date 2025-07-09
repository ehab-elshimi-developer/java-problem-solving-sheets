package sheet1;

import java.util.Scanner;

public class Sh1Pr2 {
    public Sh1Pr2() {
        System.out.println("problem 2 from sheet1");
    }

    public void run() {
        int n1, n2;

        Scanner inp = new Scanner(System.in);
        System.out.println("Please First Number?");
        n1 = inp.nextInt();
        System.out.println("Please Second Number?");
        n2 = inp.nextInt();

        System.out.println("Sum = " + (n1+n2)  +
                "\nDifference = "+ ((n1>n2)?n1-n2:n2-n1)
                +"\nProduct = " + (n1*n2));
    }
}
