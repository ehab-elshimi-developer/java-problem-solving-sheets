package sheet1;

import java.util.Scanner;

public class Sh1Pr3 {
    public Sh1Pr3() {
        System.out.println("problem 3 from sheet1");
    }

    public void run() {
        int r;
        double area ;

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter radius: ");
        r = inp.nextInt();

        area = Math.PI * r * r;
        System.out.println("Area = "+area);




    }
}
