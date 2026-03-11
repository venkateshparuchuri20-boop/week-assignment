import java.util.Scanner;

public class problem3eleven{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double weight;

        System.out.print("Enter weight in pounds: ");
        weight = input.nextDouble();

        // 1 pound = 2.2 kg
        double kg = weight / 2.2;

        System.out.println("The weight of the person in pound is " 
                           + weight + " and in kg is " + kg);

        input.close();
    }
}