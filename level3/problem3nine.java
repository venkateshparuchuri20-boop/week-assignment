import java.util.Scanner;

public class problem3nine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double weight;

        System.out.print("Enter weight in pounds: ");
        weight = input.nextDouble();

        double kg = weight / 2.2;

        System.out.println("The weight of the person in pounds is " 
                           + weight + " and in kg is " + kg);

        input.close();
    }
}