package sheet1;

public class Sh1Pr4 {
    public Sh1Pr4() {
        System.out.println("problem 4 from sheet1");
    }

    public void run() {
        int a = 5 ,b=10;

        a = a + b;   // a = 15
        b = a - b;   // b = 15 - 10 = 5
        a = a - b;   // a = 15 - 5 = 10


        System.out.println("Before Swap → a = " + a + ", b = " + b + "\n");
    }
}
