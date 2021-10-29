
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        float principle, time, rate, interest;

        System.out.println("Input Principle value:");
        Scanner psc = new Scanner(System.in);
        principle = psc.nextFloat();

        System.out.println("Imput time value:");
        Scanner tsc = new Scanner(System.in);
        time = tsc.nextFloat();

        System.out.println("Input rate value:");
        Scanner rsc = new Scanner(System.in);
        rate = rsc.nextFloat();

        interest = (principle * time * rate) / 100;

        System.out.printf("The final output of Simple interest is %f", interest);


    }
}
