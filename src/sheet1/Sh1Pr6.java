package sheet1;

import java.util.Scanner;

public class Sh1Pr6 {
    public Sh1Pr6() {
        System.out.println("problem 6 from sheet1");
    }

    public void run() {

        double n1, n2;
        char operator;


        Scanner inp = new Scanner(System.in);
        System.out.println("Enter first number: ");
        n1 = inp.nextDouble();

        System.out.println("Enter second number: ");
        n2 = inp.nextDouble();

        System.out.println("Enter operator (+ - * /): ");
        operator = inp.next().charAt(0);



        if(operator == '+') {
            System.out.printf("%.1f + %.1f = %.1f", n1,n2, (n1+n2));
        }else if(operator == '-'){
            System.out.printf("%.1f - %.1f = %.1f", n1,n2, (n1-n2));
        }else if(operator == '*'){
            System.out.printf("%.1f * %.1f = %.1f", n1,n2, (n1*n2));

        }else if(operator == '/'){
            System.out.printf("%.1f / %.1f = %.1f", n1,n2, (n1/n2));
        }else{
            System.out.println("you have to enter right operator from (+ - * /) .");
        }
    }
}
