import java.util.Scanner;

public class problem3eight{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double principal, rate, time;

        System.out.print("Enter Principal: ");
        principal = input.nextDouble();

        System.out.print("Enter Rate: ");
        rate = input.nextDouble();

        System.out.print("Enter Time: ");
        time = input.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("The Simple Interest is " + simpleInterest +
                           " for Principal " + principal +
                           ", Rate of Interest " + rate +
                           " and Time " + time);

        input.close();
    }
}