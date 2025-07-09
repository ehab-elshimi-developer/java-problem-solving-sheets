package sheet1;

import java.util.Scanner;

public class Sh1Pr1 {
    public Sh1Pr1() {
        System.out.println("problem 1 from sheet1");
    }

    public void run() {
        String name ;
        int age;

        Scanner inp = new Scanner(System.in);
        System.out.println("Please Enter Name?");
        name = inp.next();
        System.out.println("Please Enter Age?");
        age = inp.nextInt();

        System.out.println("My name is "+name+" and I am "+age+" years old.\n");
    }
}
